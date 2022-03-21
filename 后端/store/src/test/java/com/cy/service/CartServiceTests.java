package com.cy.service;

import com.cy.store.entity.Address;
import com.cy.store.service.IAddressService;
import com.cy.store.service.ICartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
//@RunWith:表示启动这个单元测试类（单元测试是不能够运行的），需要传递一个参数，必须是SpringRunne类型

@RunWith(SpringRunner.class)
public class CartServiceTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
    private ICartService cartService;

    @Test
    public void addToCart(){
        cartService.addToCart(10,10000021,10,"小招2");
    }



}
