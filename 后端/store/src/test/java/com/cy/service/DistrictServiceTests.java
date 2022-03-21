package com.cy.service;

import com.cy.store.entity.Address;
import com.cy.store.entity.District;
import com.cy.store.service.IAddressService;
import com.cy.store.service.IDistrictService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
//@RunWith:表示启动这个单元测试类（单元测试是不能够运行的），需要传递一个参数，必须是SpringRunne类型

@RunWith(SpringRunner.class)
public class DistrictServiceTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
    private IDistrictService iDistrictService;

    @Test
    public void getByParent(){
        //86表示中国，所有省的父代号都是86
        List<District> list=iDistrictService.getByParent("86");
        for (District d:list
             ) {
            System.err.println(d);
        }
    }




}
