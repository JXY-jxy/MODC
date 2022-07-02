package com.shawn.manager.service.impl;

import com.shawn.manager.dao.SponsorMapper;
import com.shawn.manager.pojo.Sponsor;
import com.shawn.manager.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorServiceImpl implements SponsorService {

    @Autowired
    SponsorMapper sponsorMapper;

    @Override
    public boolean addSponsor(String sponsorId,String sponsorName,String sponsorSex,String sponsorIdCard,String sponsorTel,String sponsorEmail) {
        return sponsorMapper.addSponsor(sponsorId,sponsorName,sponsorSex,sponsorIdCard,sponsorTel,sponsorEmail);
    }

    @Override
    public boolean deleteSponsorById(String sponsorId) {
        return sponsorMapper.deleteSponsorById(sponsorId);
    }

    @Override
    public List<Sponsor> querySponsor(String sponsorId, String sponsorName, String sponsorSex, String sponsorIdCard, String sponsorTel, String sponsorEmail,String startTime,String endTime) {
        return sponsorMapper.querySponsor(sponsorId,sponsorName,sponsorSex,sponsorIdCard,sponsorTel,sponsorEmail,startTime,endTime);
    }

    @Override
    public List<Sponsor> queryAllSponsor() {
        return sponsorMapper.queryAllSponsor();
    }
}
