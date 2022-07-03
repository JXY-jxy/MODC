package com.shawn.manager.service;

import com.shawn.manager.pojo.Default;

import java.util.List;

public interface DefaultService {
    //添加客户
    boolean addDefault(String defaultId,String clientId,String clientName,String sponsorId,String sponsorName,
                       int defaultState, String defaultRemark,
                       int defaultRete,int defaultNotch,int defaultCancel,int defaultDelay, int defaultRelate,
                       int defaultSubstitute,int defaultBankrupt);

    //根据Id删除客户
    boolean deleteDefaultById(String defaultId);


    //根据多重条件查询客户
    List<Default> queryDefault(String defaultId, String defaultName, String defaultSex, String defaultIdCard, String defaultTel, String defaultEmail, String startTime,String endTime);

    //查询所有客户
    List<Default> queryAllDefault();
}
