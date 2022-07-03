package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//审核员
public class Reviewer {
    private String reviewerId;
    private String reviewerName;
    private String reviewerSex;
    private String reviewerIdCard;
    private String reviewerTel;
    private String reviewerPwd;
    private String reviewerEmail;
    private Date reviewerCreated;
}
