package com.shawn.manager.service;

import com.shawn.manager.pojo.Reviewer;

import java.util.List;

public interface ReviewerService {
    //添加客户
    boolean addReviewer(String reviewerName,String reviewerSex,String reviewerIdCard,String reviewerTel,String reviewerEmail);

    //根据Id删除客户
    boolean deleteReviewerById(String reviewerId);


    //根据多重条件查询客户
    List<Reviewer> queryReviewer(String reviewerId, String reviewerName, String reviewerSex, String reviewerIdCard, String reviewerTel, String reviewerEmail, String startTime,String endTime);

    //查询所有客户
    List<Reviewer> queryAllReviewer();

    Reviewer loginReviewer(String reviewerTel,String reviewerPwd);
}
