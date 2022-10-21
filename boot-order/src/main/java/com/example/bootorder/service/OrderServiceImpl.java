package com.example.bootorder.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.bootcommon.model.UserAddress;
import com.example.bootcommon.service.IOrderService;
import com.example.bootcommon.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * 实现 spring-common 工程里面的 IOrderService 接口
 */
@Service
public class OrderServiceImpl implements IOrderService {
    /**
     * 引用远程调用服务
     */
    @Reference
    private IUserService userService;

    @Override
    public UserAddress placeOrder(int userId) {
        UserAddress user = userService.getUserAddById(userId);
        System.out.println("用户地址：" + user.getUserAddress());
        return user;
    }
}
