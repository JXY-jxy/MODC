package com.shawn.manager.service.impl;

import com.shawn.manager.dao.ReviewerMapper;
import com.shawn.manager.pojo.Reviewer;
import com.shawn.manager.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerServiceImpl implements ReviewerService {

    @Autowired
    ReviewerMapper reviewerMapper;

    @Override
    public boolean addReviewer(String reviewerId,String reviewerName,String reviewerSex,String reviewerIdCard,String reviewerTel,String reviewerEmail) {
        return reviewerMapper.addReviewer(reviewerId,reviewerName,reviewerSex,reviewerIdCard,reviewerTel,reviewerEmail);
    }

    @Override
    public boolean deleteReviewerById(String reviewerId) {
        return reviewerMapper.deleteReviewerById(reviewerId);
    }


    @Override
    public List<Reviewer> queryReviewer(String reviewerId, String reviewerName, String reviewerSex, String reviewerIdCard, String reviewerTel, String reviewerEmail,String startTime,String endTime) {
        return reviewerMapper.queryReviewer(reviewerId,reviewerName,reviewerSex,reviewerIdCard,reviewerTel,reviewerEmail,startTime,endTime);
    }

    @Override
    public List<Reviewer> queryAllReviewer() {
        return reviewerMapper.queryAllReviewer();
    }

    @Override
    public boolean login(String reviewerTel,String reviewerPwd) {
        return reviewerMapper.login(reviewerTel,reviewerPwd);

    }
}
