package com.cy.service;

import com.cy.store.entity.Address;
import com.cy.store.entity.User;
import com.cy.store.service.IAddressService;
import com.cy.store.service.IUserService;
import com.cy.store.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@SpringBootTest
//@RunWith:表示启动这个单元测试类（单元测试是不能够运行的），需要传递一个参数，必须是SpringRunne类型

@RunWith(SpringRunner.class)
public class AddressServiceTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
    private IAddressService addressService;

    @Test
    public void addNewAddress(){
        Address address=new Address();
        address.setPhone("15778656867");
        address.setName("sas");
        addressService.addNewAddress(1,"管理员",address);
    }

    @Test
    public void setDefault(){
        addressService.setDefault(6,10,"jj");
    }

    @Test
    public void delete(){
        addressService.delete(2,1,"jj");
    }


}
