package com.example.bootcommon.service;


import com.example.bootcommon.model.UserAddress;

public interface IUserService {

    /**
     * 根据 ID 获取用户地址
     * @param userId
     * @return
     */
    UserAddress getUserAddById(int userId);
}
