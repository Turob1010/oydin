package com.microservice.paymentservice.Controller;

import com.microservice.paymentservice.Entity.Payment;
import com.microservice.paymentservice.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {
    @Autowired
    private PaymentService service;
    @PostMapping("/dopayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }
}
