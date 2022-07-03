package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.util.Date;

@Data
//审核员
public class Reviewer {
    private String reviewerId;
    private String reviewerName;
    private String reviewerSex;
    private String reviewerIdCard;
    private String reviewerTel;
    private String reviewerEmail;
    private Date reviewerCreated;
}
