package com.simple.mapper;

import com.simple.pojo.Users;

import java.util.List;

public interface UsersMapper {

     void insertUser(Users users);

     List<Users> selectUserAll();
}
