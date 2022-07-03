package com.shawn.manager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private int defaultSeverity;
    private int defaultNotch;
    private int defaultCancel;
    private int defaultDelay;
    private int defaultRelate;
    private int defaultSubstitute;
    private int defaultBankrupt;
    private int defaultExternal;
}
