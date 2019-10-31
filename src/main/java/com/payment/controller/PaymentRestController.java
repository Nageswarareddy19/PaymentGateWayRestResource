package com.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.PaymentModel;
import com.payment.model.PaymentResponse;
import com.payment.service.PaymentService;

@RestController
public class PaymentRestController {
	public PaymentRestController() {
		System.out.println("PaymentRestController() method is called");
	}

	@Autowired
	private PaymentService payService;

	@PostMapping(value = "/pay", consumes = { "application/json" }, produces = { "application/json" })
	public PaymentResponse doPaymentNow(@RequestBody PaymentModel model) {
		PaymentResponse response = payService.payNow(model);

		return response;

	}

	@GetMapping(value = "/getTrans/{vendor}", produces = "application/json")
	public List<PaymentModel> getTranscations(@PathVariable("vendor") String vendor) {
		List<PaymentModel> listmodel = payService.findByVendorName(vendor);
		return listmodel;

	}

}
