package com.example.bootcommon.service;


import com.example.bootcommon.model.UserAddress;

public interface IOrderService {

    /**
     * 用户下单接口
     * @param userId
     * @return
     */
    UserAddress placeOrder(int userId);
}
