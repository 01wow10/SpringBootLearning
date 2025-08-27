package com.day3_yml_learning.controller;

import com.day3_yml_learning.pay.PayMent;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pay")
public class PayController {
    @Resource
    private PayMent payMent;
    @RequestMapping("method")
    public void pay()
    {
        payMent.pay();
    }
}
