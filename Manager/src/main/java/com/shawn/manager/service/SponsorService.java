package com.shawn.manager.service;

import com.shawn.manager.pojo.Sponsor;

import java.util.List;

public interface SponsorService {
    //添加客户
    boolean addSponsor(String sponsorId,String sponsorName,String sponsorSex,String sponsorIdCard,String sponsorTel,String sponsorEmail);

    //根据Id删除客户
    boolean deleteSponsorById(String sponsorId);

    //根据多重条件查询客户
    List<Sponsor> querySponsor(String sponsorId, String sponsorName, String sponsorSex, String sponsorIdCard, String sponsorTel, String sponsorEmail, String startTime,String endTime);

    //查询所有客户
    List<Sponsor> queryAllSponsor();

    //登录
    Sponsor loginSponsor(String sponsorTel,String sponsorPwd);

}
