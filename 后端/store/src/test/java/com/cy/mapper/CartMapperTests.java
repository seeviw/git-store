package com.cy.mapper;

import com.cy.store.entity.Address;
import com.cy.store.entity.Cart;
import com.cy.store.mapper.AddressMapper;
import com.cy.store.mapper.CartMapper;
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
public class CartMapperTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
   private CartMapper cartMapper;

    /*
    * 1.必须被Test注解所修饰
    * 2.返回值类型必须时void
    * 3.方法的参数列表不知道任何类型
    * 4.方法的访问修饰符必须时public
    * */
    @Test
    public void insert(){
        Cart cart=new Cart();
        cart.setUid(10);
        cart.setPid(10000021);
        cart.setPrice(1000L);
        cart.setNum(2);
        cartMapper.insert(cart);
    }

    @Test
    public void updateNumByUid(){
        cartMapper.updateNumByCid(1,2,"jj",new Date());
    }

    @Test
    public void findByUidAndPid(){
       Cart cart= cartMapper.findByUidAndPid(10,10000021);
        System.out.println(cart);
    }
    @Test
    public void findVOByUid(){
        System.out.println(cartMapper.findVOByUid(10));
    }
    @Test
    public void findByCid(){
        System.out.println(cartMapper.findByCid(2));
    }

    @Test
    public void findVOByCid(){
        Integer[] cids= {1, 2, 3};
        System.out.println(cartMapper.findVOByCid(cids));
    }
}
