package com.simple.test;

import com.simple.mapper.UsersMapper;
import com.simple.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("张三");
        this.usersMapper.insertUser(users);
    }

    @Test
    public void selectUserAllTest(){

            List<Users> list = usersMapper.selectUserAll();
            System.out.println(list);


    }
}
