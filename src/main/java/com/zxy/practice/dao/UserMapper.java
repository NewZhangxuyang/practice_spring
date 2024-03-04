package com.zxy.practice.dao;

import com.zxy.practice.PoJo.User;

import java.util.List;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-01-17:13
 * @Description:
 */
public interface UserMapper {

    User selectUserByUserId(String userId);


    List<User> selectAllUser();



    void insertUser(User user);


    void updateUser(User user);

    /**
     * 删除用户
     */
    void deleteUser(String id);


    void selectUserByName(String name);


}
