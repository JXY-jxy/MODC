package com.shawn.manager.dao;

import com.shawn.manager.pojo.Rebirth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RebirthMapper {

    //添加违约情况
    boolean addRebirth(@Param("defaultId")String defaultId,
                       @Param("rebirthState")String rebirthState, @Param("rebirthRemark")String rebirthRemark,
                       @Param("rebirthRelieve")String rebirthRelieve, @Param("rebirthSettle")String rebirthSettle,
                       @Param("rebirthChange")String rebirthChange, @Param("rebirthReduce")String rebirthReduce,
                       @Param("rebirthPay")String rebirthPay, @Param("rebirthRepay")String rebirthRepay
                       );

    //更新审核状态 0不违约 1违约
    boolean updateRebirthStateToPass(@Param("rebirthId") String rebirthId);

    boolean updateRebirthStateToFail(@Param("rebirthId") String rebirthId);

    //根据多重条件查询重生情况
    List<Rebirth> queryRebirth(@Param("rebirthId")String rebirthId, @Param("defaultId")String defaultId,@Param("clientName")String clientName,
                               @Param("rebirthState")String rebirthState, @Param("rebirthRemark")String rebirthRemark,
                               @Param("rebirthRelieve")String rebirthRelieve, @Param("rebirthSettle")String rebirthSettle,
                               @Param("rebirthChange")String rebirthChange, @Param("rebirthReduce")String rebirthReduce,
                               @Param("rebirthPay")String rebirthPay, @Param("rebirthRepay")String rebirthRepay,
                               @Param("startCreated")String startCreated, @Param("endCreated") String endCreated
                            );

    //查询所有违约情况
    List<Rebirth> queryAllRebirth();

    }
