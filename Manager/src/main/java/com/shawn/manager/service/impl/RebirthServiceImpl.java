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
    public boolean addRebirth(String rebirthId,String defaultId,int rebirthState,String rebirthRemark,int rebirthRelieve,
                              int rebirthSettle, int rebirthChange,int rebirthReduce,int rebirthPay,int rebirthRepay) {
        return rebirthMapper.addRebirth( rebirthId, defaultId, rebirthState, rebirthRemark, rebirthRelieve,
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
    public List<Rebirth> queryRebirth(String rebirthId,String defaultId,int rebirthState,String rebirthRemark,int rebirthRelieve,
                                      int rebirthSettle, int rebirthChange,int rebirthReduce,int rebirthPay,int rebirthRepay,
                                      String startCreated, String endCreated) {
        return rebirthMapper.queryRebirth( rebirthId, defaultId, rebirthState, rebirthRemark, rebirthRelieve,
         rebirthSettle,  rebirthChange, rebirthReduce, rebirthPay, rebirthRepay,
         startCreated,  endCreated);
    }

    @Override
    public List<Rebirth> queryAllRebirth() {
        return rebirthMapper.queryAllRebirth();
    }
}
