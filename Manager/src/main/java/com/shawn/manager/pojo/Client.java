package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//客户
/**
 * Author: shawn
 * Time: 2022/7/3
 * Description:
 */
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
    private String clientState;
    private String clientRete;


}
