package com.cy.mapper;

import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@SpringBootTest
//@RunWith:表示启动这个单元测试类（单元测试是不能够运行的），需要传递一个参数，必须是SpringRunne类型

@RunWith(SpringRunner.class)
public class UserMapperTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
    private UserMapper userMapper;

    /*
    * 1.必须被Test注解所修饰
    * 2.返回值类型必须时void
    * 3.方法的参数列表不知道任何类型
    * 4.方法的访问修饰符必须时public
    * */
    @Test
    public void insert(){
        User user=new User();
        user.setUsername("tim");
        user.setPassword("123");
        Integer rows=userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername(){
      User user=userMapper.findByUsername("tim");
        System.out.println(user);
    }
    @Test
    public void updatePasswordByUid(){

         userMapper.updatePasswordByUid(7,"321","管理员",new Date());

    }

    @Test
    public void findByUid(){
        System.out.println(userMapper.findByUid(8));
    }

    @Test
    public void updateInfoByUid(){
        User user=new User();
        user.setUid(9);
        user.setPhone("15778");
        user.setEmail("1344@qq.com");
        user.setGender(1);
        userMapper.updateInfoByUid(user);

    }
    @Test
    public void updateAvatarByUid(){
        userMapper.updateAvatarByUid(9,"abc","系统管理员",new Date());
    }
}
