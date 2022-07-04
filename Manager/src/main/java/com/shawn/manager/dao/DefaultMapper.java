package com.shawn.manager.dao;

import com.shawn.manager.pojo.Default;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DefaultMapper {

    //添加违约情况
    boolean addDefault(@Param("clientId")String clientId, @Param("clientName")String clientName,
                       @Param("sponsorId")String sponsorId, @Param("sponsorName")String sponsorName, @Param("defaultState")String defaultState,
                       @Param("defaultRemark")String defaultRemark, @Param("defaultSeverity")String defaultSeverity, @Param("defaultNotch")String defaultNotch,
                       @Param("defaultCancel")String defaultCancel, @Param("defaultDelay")String defaultDelay,
                       @Param("defaultRelate")String defaultRelate, @Param("defaultSubstitute")String defaultSubstitute,
                       @Param("defaultBankrupt")String defaultBankrupt, @Param("defaultExternal")String defaultExternal);

    //更新审核状态 0不违约 1违约
    boolean updateDefalutStateToPass(@Param("defaultId") String defaultId);

    boolean updateDefalutStateToFail(@Param("defaultId") String defaultId);

    //根据多重条件查询违约情况
    List<Default> queryDefault(@Param("defaultId")String defaultId, @Param("clientId")String clientId, @Param("clientName")String clientName,
                               @Param("sponsorId")String sponsorId, @Param("sponsorName")String sponsorName, @Param("defaultState")String defaultState,
                               @Param("clientRete")String clientRete, @Param("defaultSeverity")String defaultSeverity, @Param("defaultNotch")String defaultNotch,
                               @Param("defaultCancel")String defaultCancel, @Param("defaultDelay")String defaultDelay, @Param("defaultRelate")String defaultRelate,
                               @Param("defaultSubstitute")String defaultSubstitute, @Param("defaultBankrupt")String defaultBankrupt,@Param("defaultExternal")String defaultExternal,
                               @Param("startCreated")String startCreated, @Param("endCreated") String endCreated,
                               @Param("startReviewed")String startReviewed, @Param("endReviewed") String endReviewed);

    //查询所有违约情况
    List<Default> queryAllDefault();

    }
