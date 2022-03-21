package com.cy.service;

import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
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
public class UserServiceTests {
    //idea 有检测的功能，接口是不能够直接创建bean的，（动态代理）
    @Autowired
    private IUserService userService;



    /*
    * 1.必须被Test注解所修饰
    * 2.返回值类型必须时void
    * 3.方法的参数列表不知道任何类型
    * 4.方法的访问修饰符必须时public
    * */

    @Test
    public void reg(){
        try {
            User user=new User();
            user.setUsername("陈政jj");
            user.setPassword("123");
            userService.reg(user);
            System.out.println("ok");
        } catch (ServiceException e) {
            //获取类的对象，再获取类的名称
            System.out.println(e.getClass().getSimpleName());
            //异常的具体信息打印输出
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void login(){
       User user= userService.login("测试3","123123");
        System.out.println(user);
    }


    @Test
    public void changePassword(){
        userService.changePassword(9,"管理员","123","321");
    }

    @Test
    public void getByUid(){

        System.out.println(userService.getByUid(9));
    }

    @Test
    public void changeInfo(){
        User user=new User();
        user.setPhone("123123132");
        user.setEmail("12516");
        user.setGender(0);
        userService.changeInfo(9,"管理员",user);
    }
    @Test
    public void changeAvatar(){
        userService.changeAvatar(9,"/upload/test.png","下你们");
    }

}
