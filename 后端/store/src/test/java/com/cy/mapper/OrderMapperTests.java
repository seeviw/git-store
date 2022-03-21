package com.cy.mapper;

import com.cy.store.entity.Address;
import com.cy.store.entity.Order;
import com.cy.store.entity.OrderItem;
import com.cy.store.mapper.AddressMapper;
import com.cy.store.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@SpringBootTest
//@RunWith:表示启动这个单元测试类（单元测试是不能够运行的），需要传递一个参数，必须是SpringRunne类型

@RunWith(SpringRunner.class)
public class OrderMapperTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
   private OrderMapper orderMapper;
    @Test
  public void insertOrder(){
        Order order=new Order();
        order.setUid(10);
        order.setRecvName("容嬷嬷");
        order.setRecvPhone("17878588");
        orderMapper.insertOrder(order);
  }

  @Test
    public void insertOrderItem(){
      OrderItem order=new OrderItem();
      order.setOid(1);
      order.setPid(10000021);
      order.setTitle("联系笔记本");
      orderMapper.insertOrderItem(order);
  }
}
