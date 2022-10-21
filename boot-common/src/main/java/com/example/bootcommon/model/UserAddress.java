package com.example.bootcommon.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;
}
