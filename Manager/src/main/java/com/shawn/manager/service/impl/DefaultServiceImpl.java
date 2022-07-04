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
    public boolean addDefault(String clientId,String clientName,String sponsorId,String sponsorName,
                              String defaultState, String clientRete, String defaultSeverity,String defaultNotch,String defaultCancel,
                              String defaultDelay, String defaultRelate, String defaultSubstitute,String defaultBankrupt,String defaultExternal) {
        return defaultMapper.addDefault(clientId,clientName,sponsorId,sponsorName,defaultState,
                clientRete,defaultSeverity,defaultNotch,defaultCancel,defaultDelay,
                defaultRelate,defaultSubstitute,defaultBankrupt,defaultExternal);
    }

    @Override
    public boolean updateDefalutStateToPass(String defaultId) {
        return defaultMapper.updateDefalutStateToPass(defaultId);
    }

    @Override
    public boolean updateDefalutStateToFail(String defaultId) {
        return defaultMapper.updateDefalutStateToFail(defaultId);
    }

    @Override
    public List<Default> queryDefault(String defaultId,String clientId,String clientName,String sponsorId,String sponsorName,
                                      String defaultState, String defaultRemark, String defaultSeverity,String defaultNotch,String defaultCancel,
                                      String defaultDelay, String defaultRelate, String defaultSubstitute,String defaultBankrupt,String defaultExternal,
                                      String startCreated,String endCreated,String startReviewed,String endReviewed) {
        return defaultMapper.queryDefault(defaultId,clientId,clientName,sponsorId,sponsorName,defaultState,
                defaultRemark,defaultSeverity,defaultNotch,defaultCancel,defaultDelay, defaultRelate,defaultSubstitute,
                defaultBankrupt,defaultExternal,startCreated,endCreated,startReviewed,endReviewed);
    }

    @Override
    public List<Default> queryAllDefault() {
        return defaultMapper.queryAllDefault();
    }
}
