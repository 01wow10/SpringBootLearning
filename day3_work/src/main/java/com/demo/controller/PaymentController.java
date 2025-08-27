package com.demo.controller;

import com.demo.pay.Payment;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "payment")
@RestController
public class PaymentController {
    @Resource
    private Payment payment;
    @RequestMapping(value = "pay")
    public void pay()
    {
        payment.pay();
    }
}
