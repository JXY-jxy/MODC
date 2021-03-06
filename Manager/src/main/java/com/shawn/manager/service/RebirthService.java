package com.shawn.manager.service;

import com.shawn.manager.pojo.Client;
import com.shawn.manager.pojo.Rebirth;

import java.util.List;

public interface RebirthService {
    //添加重生情况
    boolean addRebirth(String defaultId,String rebirthState,String rebirthRemark,String rebirthRelieve,
                       String rebirthSettle, String rebirthChange,String rebirthReduce,String rebirthPay,String rebirthRepay);

    //更新审核状态 0未审核 1审核通过
    boolean updateRebirthStateToPass(String rebirthId);

    //更新审核状态 0未审核 2审核不通过
    boolean updateRebirthStateToFail(String rebirthId);

    //根据多重条件查询违约情况
    List<Rebirth> queryRebirth(String rebirthId,String defaultId,String clientName,String rebirthState,String rebirthRemark,String rebirthRelieve,
                               String rebirthSettle, String rebirthChange,String rebirthReduce,String rebirthPay,String rebirthRepay,
                               String startCreated, String endCreated);

    //查询所有违约情况
    List<Rebirth> queryAllRebirth();
}
