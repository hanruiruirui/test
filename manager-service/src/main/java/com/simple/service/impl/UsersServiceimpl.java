package com.simple.service.impl;
import com.simple.mapper.UsersMapper;
import com.simple.pojo.Users;
import com.simple.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceimpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}
