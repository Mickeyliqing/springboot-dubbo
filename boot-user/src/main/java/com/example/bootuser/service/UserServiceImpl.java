package com.example.bootuser.service;

import com.example.bootcommon.model.UserAddress;
import com.example.bootcommon.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * 实现 spring-common 工程里面的 IUserService 接口
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public UserAddress getUserAddById(int userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserAddress("杭州");
        return userAddress;
    }
}
