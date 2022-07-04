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
    private String defaultState;
    private String defaultRemark;
    private Date defaultCreated;
    private Date defaultReviewed;
    private String defaultSeverity;
    private String defaultNotch;
    private String defaultCancel;
    private String defaultDelay;
    private String defaultRelate;
    private String defaultSubstitute;
    private String defaultBankrupt;
    private String defaultExternal;
}
