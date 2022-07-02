package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//客户
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String clientId;
    private String clientName;
    private String clientSex;
    private String clientIdCard;
    private String clientTel;
    private String clientEmail;
    private Date clientCreated;
    private int clientState;


}