package com.shawn.manager.dao;

import com.shawn.manager.pojo.Default;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DefaultMapper {

    //添加客户
    boolean addDefault(@Param("defaultId")String defaultId, @Param("clientId")String clientId, @Param("clientName")String clientName,
                       @Param("sponsorId")String sponsorId, @Param("sponsorName")String sponsorName, @Param("defaultState")int defaultState,
                       @Param("defaultRemark")String defaultRemark, @Param("defaultRete")int defaultRete, @Param("defaultNotch")int defaultNotch,
                       @Param("defaultCancel")int defaultCancel, @Param("defaultDelay")int defaultDelay,
                       @Param("defaultRelate")int defaultRelate, @Param("defaultSubstitute")int defaultSubstitute,
                       @Param("defaultBankrupt")int defaultBankrupt);

    //根据Id删除客户
    boolean deleteDefaultById(@Param("defaultId") String defaultId);

    //根据多重条件查询客户
    List<Default> queryDefault(@Param("defaultId")String defaultId, @Param("defaultName")String defaultName, @Param("defaultSex")String defaultSex,
                               @Param("defaultIdCard")String defaultIdCard, @Param("defaultTel") String defaultTel, @Param("defaultEmail")String defaultEmail,
                               @Param("startTime")String startTime, @Param("endTime") String endTime);

    //查询所有客户
    List<Default> queryAllDefault();

    }
