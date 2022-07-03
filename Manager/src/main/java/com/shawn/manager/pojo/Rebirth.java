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
    private int rebirthState;
    private String rebirthRemark;
    private Date rebirthCreated;
    private int rebirthRelieve;
    private int rebirthSettle;
    private int rebirthChange;
    private int rebirthReduce;
    private int rebirthPay;
    private int rebirthRepay;

}
