package com.demo.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class ChengXinYouXuan implements  Payment{
    @Override
    public void pay()
    {
        System.out.println("使用橙心优选");
    }
}
