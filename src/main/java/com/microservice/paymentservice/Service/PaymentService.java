package com.microservice.paymentservice.Service;

import com.microservice.paymentservice.Entity.Payment;
import com.microservice.paymentservice.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;
    public String paymentProcessing(){
        return new Random().nextBoolean()?"success":"false";
    }
    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }


}
