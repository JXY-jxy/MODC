package com.shawn.manager.pojo;

import lombok.Data;

import java.util.Date;

@Data
//审核员
public class Default {
    private String defaultId;
    private String clientId;
    private String clientName;
    private String sponsorId;
    private String sponsorName;
    private int defaultState;
    private String defaultRemark;
    private Date defaultCreated;
    private Date defaultReviewed;
    private int defaultRete;
    private int defaultNotch;
    private int defaultCancel;
    private int defaultDelay;
    private int defaultRelate;
    private int defaultSubstitute;
    private int defaultBankrupt;
}
