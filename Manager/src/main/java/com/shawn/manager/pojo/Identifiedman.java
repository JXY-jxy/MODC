package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.util.Date;

@Data
//违约认定人
public class Identifiedman {
    private String IdentifiedmanId;
    private String identifiedmanName;
    private String identifiedmanSex;
    private String identifiedmanIdCard;
    private String identifiedmanTel;
    private String identifiedmanEmail;
    private Date identifiedmanCreated;
}
