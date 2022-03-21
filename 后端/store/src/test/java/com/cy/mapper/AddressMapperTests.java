package com.cy.mapper;

import com.cy.store.entity.Address;
import com.cy.store.entity.User;
import com.cy.store.mapper.AddressMapper;
import com.cy.store.mapper.UserMapper;
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
public class AddressMapperTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
   private AddressMapper addressMapper;

    /*
    * 1.必须被Test注解所修饰
    * 2.返回值类型必须时void
    * 3.方法的参数列表不知道任何类型
    * 4.方法的访问修饰符必须时public
    * */
   @Test
    public void insert(){
       Address address=new Address();
       address.setUid(1);
       address.setPhone("123123132");
       address.setName("ss");
       addressMapper.insert(address);
   }
   @Test
    public void countByUid(){
       Integer count=addressMapper.countByUid(1);
       System.out.println(count);
   }

   @Test
    public void finByUid(){
       List<Address> list=addressMapper.findByUid(10);
       System.out.println(list);
   }

   @Test
   public void updateNoDafault(){
      addressMapper.updateNoDafault(10);
   }

    @Test
    public void updateDefaultByAid(){
     addressMapper.updateDefaultByAid(5,"小招",new Date());
    }

    @Test
    public void findByAid(){
        System.out.println(addressMapper.findByAid(5));
    }

    @Test
    public void deleteByUid(){
       addressMapper.deleteByAid(6);
    }
    @Test
    public void findLastModified(){
        System.out.println(addressMapper.findLastModified(10));
    }
}
