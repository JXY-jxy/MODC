package com.shawn.manager.service.impl;

import com.shawn.manager.dao.DefaultMapper;
import com.shawn.manager.pojo.Default;
import com.shawn.manager.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultServiceImpl implements DefaultService {

    @Autowired
    DefaultMapper defaultMapper;

    @Override
    public boolean addDefault(String defaultId,String clientId,String clientName,String sponsorId,String sponsorName,
                              int defaultState, String defaultRemark,
                              int defaultRete,int defaultNotch,int defaultCancel,int defaultDelay, int defaultRelate,
                              int defaultSubstitute,int defaultBankrupt) {
        return defaultMapper.addDefault(defaultId,clientId,clientName,sponsorId,sponsorName,defaultState,
                defaultRemark,defaultRete,defaultNotch,defaultCancel,defaultDelay,
                defaultRelate,defaultSubstitute,defaultBankrupt);
    }

    @Override
    public boolean deleteDefaultById(String defaultId) {
        return defaultMapper.deleteDefaultById(defaultId);
    }


    @Override
    public List<Default> queryDefault(String defaultId, String defaultName, String defaultSex, String defaultIdCard, String defaultTel, String defaultEmail,String startTime,String endTime) {
        return defaultMapper.queryDefault(defaultId,defaultName,defaultSex,defaultIdCard,defaultTel,defaultEmail,startTime,endTime);
    }

    @Override
    public List<Default> queryAllDefault() {
        return defaultMapper.queryAllDefault();
    }
}
