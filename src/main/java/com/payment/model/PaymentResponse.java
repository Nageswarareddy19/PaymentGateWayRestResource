package com.payment.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class PaymentResponse {
	private String status;
	private String message;
	private String txdate;
	private String txId;
	private List<PaymentModel> payments;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTxdate() {
		return txdate;
	}

	public void setTxdate(String txdate) {
		this.txdate = txdate;
	}

	public List<PaymentModel> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentModel> payments) {
		this.payments = payments;
	}

	public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}

	@Override
	public String toString() {
		return "PaymentResponse [status=" + status + ", message=" + message + ", txdate=" + txdate + ", txId=" + txId
				+ ", payments=" + payments + "]";
	}

}
