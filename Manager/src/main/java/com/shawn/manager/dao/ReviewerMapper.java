package com.shawn.manager.dao;

import com.shawn.manager.pojo.Reviewer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReviewerMapper {

    //添加客户
    boolean addReviewer(@Param("reviewerName")String reviewerName, @Param("reviewerSex")String reviewerSex,
                       @Param("reviewerIdCard")String reviewerIdCard, @Param("reviewerTel") String reviewerTel, @Param("reviewerEmail")String reviewerEmail);

    //根据Id删除客户
    boolean deleteReviewerById(@Param("reviewerId") String reviewerId);

    //根据多重条件查询客户
    List<Reviewer> queryReviewer(@Param("reviewerId")String reviewerId, @Param("reviewerName")String reviewerName, @Param("reviewerSex")String reviewerSex,
                               @Param("reviewerIdCard")String reviewerIdCard, @Param("reviewerTel") String reviewerTel, @Param("reviewerEmail")String reviewerEmail,
                               @Param("startTime")String startTime, @Param("endTime") String endTime);

    //查询所有客户
    List<Reviewer> queryAllReviewer();

    //审核员登录
    Reviewer loginReviewer(@Param("reviewerTel") String reviewerTel,@Param("reviewerPwd") String reviewerPwd);

}
