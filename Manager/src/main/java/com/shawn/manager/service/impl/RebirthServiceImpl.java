package com.shawn.manager.service.impl;

import com.shawn.manager.dao.RebirthMapper;
import com.shawn.manager.pojo.Rebirth;
import com.shawn.manager.service.RebirthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebirthServiceImpl implements RebirthService {

    @Autowired
    RebirthMapper rebirthMapper;

    @Override
    public boolean addRebirth(String defaultId,String rebirthState,String rebirthRemark,String rebirthRelieve,
                              String rebirthSettle, String rebirthChange,String rebirthReduce,String rebirthPay,String rebirthRepay) {
        return rebirthMapper.addRebirth(defaultId, rebirthState, rebirthRemark, rebirthRelieve,
         rebirthSettle,  rebirthChange, rebirthReduce, rebirthPay, rebirthRepay);
    }


    @Override
    public boolean updateRebirthStateToPass(String rebirthId) {
        return rebirthMapper.updateRebirthStateToPass(rebirthId);
    }

    @Override
    public boolean updateRebirthStateToFail(String rebirthId) {
        return rebirthMapper.updateRebirthStateToFail(rebirthId);
    }


    @Override
    public List<Rebirth> queryRebirth(String rebirthId,String defaultId,String clientName,String rebirthState,String rebirthRemark,String rebirthRelieve,
                                      String rebirthSettle, String rebirthChange,String rebirthReduce,String rebirthPay,String rebirthRepay,
                                      String startCreated, String endCreated) {
        return rebirthMapper.queryRebirth( rebirthId, defaultId, clientName, rebirthState, rebirthRemark, rebirthRelieve,
         rebirthSettle,  rebirthChange, rebirthReduce, rebirthPay, rebirthRepay,
         startCreated,  endCreated);
    }

    @Override
    public List<Rebirth> queryAllRebirth() {
        return rebirthMapper.queryAllRebirth();
    }
}
