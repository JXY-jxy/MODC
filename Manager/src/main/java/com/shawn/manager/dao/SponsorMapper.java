package com.shawn.manager.dao;

import com.shawn.manager.pojo.Sponsor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SponsorMapper {

    //添加客户
    boolean addSponsor(@Param("sponsorId")String sponsorId,@Param("sponsorName")String sponsorName,@Param("sponsorSex")String sponsorSex,
                      @Param("sponsorIdCard")String sponsorIdCard, @Param("sponsorTel") String sponsorTel,@Param("sponsorEmail")String sponsorEmail);

    //根据Id删除客户
    boolean deleteSponsorById(@Param("sponsorId") String sponsorId);

    //根据多重条件查询客户
    List<Sponsor> querySponsor(@Param("sponsorId")String sponsorId, @Param("sponsorName")String sponsorName, @Param("sponsorSex")String sponsorSex,
                             @Param("sponsorIdCard")String sponsorIdCard, @Param("sponsorTel") String sponsorTel, @Param("sponsorEmail")String sponsorEmail,
                             @Param("startTime")String startTime, @Param("endTime") String endTime);

    //查询所有客户
    List<Sponsor> queryAllSponsor();

    //申请发起人登录
    Sponsor loginSponsor(@Param("sponsorTel") String sponsorTel,@Param("sponsorPwd") String sponsorPwd);


}
