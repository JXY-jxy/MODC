package com.shawn.manager.service;

import com.shawn.manager.pojo.Default;

import java.util.List;

public interface DefaultService {
    //添加违约情况
    boolean addDefault(String defaultId,String clientId,String clientName,String sponsorId,String sponsorName,
                       int defaultState, String defaultRemark,
                       int defaultSeverity,int defaultNotch,int defaultCancel,int defaultDelay, int defaultRelate,
                       int defaultSubstitute,int defaultBankrupt,int defaultExternal);

    //更新审核状态 0未审核 1审核通过
    boolean updateDefalutStateToPass(String defaultId);

    //更新审核状态 0未审核 2审核不通过
    boolean updateDefalutStateToFail(String defaultId);

    //根据多重条件查询违约情况
    List<Default> queryDefault(String defaultId,String clientId,String clientName,String sponsorId,String sponsorName,
                               int defaultState, String defaultRemark, int defaultSeverity,int defaultNotch,int defaultCancel,
                               int defaultDelay, int defaultRelate, int defaultSubstitute,int defaultBankrupt,int defaultExternal,
                               String startCreated,String endCreated,String startReviewed,String endReviewed);

    //查询所有违约情况
    List<Default> queryAllDefault();
}
