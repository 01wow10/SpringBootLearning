package com.demo.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("pro")
public class MeiTuanYouXuan implements  Payment{
    @Override
    public void pay()
    {
    	System.out.println("使用美团优选");
    }

}
