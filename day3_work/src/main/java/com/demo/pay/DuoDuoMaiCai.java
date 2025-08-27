package com.demo.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
public class DuoDuoMaiCai implements Payment{
    @Override
    public void pay() {
        System.out.println("使用多多买菜");
    }
}
