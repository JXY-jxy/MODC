package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
//重生发起人
public class Sponsor {
    private String sponsorId;
    private String sponsorName;
    private String sponsorSex;
    private String sponsorIdCard;
    private String sponsorTel;
    private String sponsorEmail;
    private DateTime sponsorCreated;
}
