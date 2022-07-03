package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//申请发起人
public class Sponsor {
    private String sponsorId;
    private String sponsorName;
    private String sponsorSex;
    private String sponsorIdCard;
    private String sponsorTel;
    private String sponsorPwd;
    private String sponsorEmail;
    private Date sponsorCreated;
}
