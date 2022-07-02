package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.util.Date;

@Data
//申请发起人
public class Sponsor {
    private String sponsorId;
    private String sponsorName;
    private String sponsorSex;
    private String sponsorIdCard;
    private String sponsorTel;
    private String sponsorEmail;
    private Date sponsorCreated;
}
