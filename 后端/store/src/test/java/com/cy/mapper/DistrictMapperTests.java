package com.cy.mapper;

import com.cy.store.entity.Address;
import com.cy.store.entity.District;
import com.cy.store.mapper.AddressMapper;
import com.cy.store.mapper.DistrictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
//@RunWith:表示启动这个单元测试类（单元测试是不能够运行的），需要传递一个参数，必须是SpringRunne类型

@RunWith(SpringRunner.class)
public class DistrictMapperTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
   private DistrictMapper districtMapper;

    @Test
    public void findByParent(){
        List<District> list=districtMapper.findByParent("210100");
        for(District d:list){
            System.out.println(d);
        }
    }
    @Test
    public void findNameByCode(){
       String name= districtMapper.findNameByCode("610000");
        System.out.println(name);
    }

}
