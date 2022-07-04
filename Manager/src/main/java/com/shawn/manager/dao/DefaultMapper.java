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
                       @Param("sponsorId")String sponsorId, @Param("sponsorName")String sponsorName, @Param("defaultState")int defaultState,
                       @Param("defaultRemark")String defaultRemark, @Param("defaultSeverity")int defaultSeverity, @Param("defaultNotch")int defaultNotch,
                       @Param("defaultCancel")int defaultCancel, @Param("defaultDelay")int defaultDelay,
                       @Param("defaultRelate")int defaultRelate, @Param("defaultSubstitute")int defaultSubstitute,
                       @Param("defaultBankrupt")int defaultBankrupt, @Param("defaultExternal")int defaultExternal);

    //更新审核状态 0不违约 1违约
    boolean updateDefalutStateToPass(@Param("defaultId") String defaultId);

    boolean updateDefalutStateToFail(@Param("defaultId") String defaultId);

    //根据多重条件查询违约情况
    List<Default> queryDefault(@Param("defaultId")String defaultId, @Param("clientId")String clientId, @Param("clientName")String clientName,
                               @Param("sponsorId")String sponsorId, @Param("sponsorName")String sponsorName, @Param("defaultState")int defaultState,
                               @Param("defaultRemark")String defaultRemark, @Param("defaultSeverity")int defaultSeverity, @Param("defaultNotch")int defaultNotch,
                               @Param("defaultCancel")int defaultCancel, @Param("defaultDelay")int defaultDelay, @Param("defaultRelate")int defaultRelate,
                               @Param("defaultSubstitute")int defaultSubstitute, @Param("defaultBankrupt")int defaultBankrupt,@Param("defaultExternal")int defaultExternal,
                               @Param("startCreated")String startCreated, @Param("endCreated") String endCreated,
                               @Param("startReviewed")String startReviewed, @Param("endReviewed") String endReviewed);

    //查询所有违约情况
    List<Default> queryAllDefault();

    }
