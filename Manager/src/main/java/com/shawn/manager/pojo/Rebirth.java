package com.shawn.manager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rebirth {
    private String rebirthId;
    private String defaultId;
    private String rebirthState;
    private String rebirthRemark;
    private Date rebirthCreated;
    private String rebirthRelieve;
    private String rebirthSettle;
    private String rebirthChange;
    private String rebirthReduce;
    private String rebirthPay;
    private String rebirthRepay;

}
