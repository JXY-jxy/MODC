package com.shawn.manager.pojo;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
//审核员
public class Reviewer {
    private String reviewerId;
    private String reviewerName;
    private String reviewerSex;
    private String reviewerIdCard;
    private String reviewerTel;
    private String reviewerEmail;
    private String reviewerSector;//部门
    private DateTime reviewerCreated;
}
