package com.shawn.manager.controller;

import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Reviewer;
import com.shawn.manager.service.impl.ReviewerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/reviewer")
public class ReviewerController {

    @Autowired
    ReviewerServiceImpl reviewerService;

    @RequestMapping(value="/addReviewer", method = RequestMethod.POST)
    public Result<Boolean> addReviewer(
                                     @RequestParam(value = "reviewerName") String reviewerName,
                                     @RequestParam(value = "reviewerSex")String reviewerSex,
                                     @RequestParam(value = "reviewerIdCard")String reviewerIdCard,
                                     @RequestParam(value = "reviewerTel")String reviewerTel,
                                     @RequestParam(value ="reviewerEmail") String reviewerEmail
                                     ){

        boolean result = reviewerService.addReviewer(reviewerName,reviewerSex,reviewerIdCard,reviewerTel,reviewerEmail);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/deleteReviewerById", method = RequestMethod.DELETE)
    public Result<Boolean> deleteReviewerById(@RequestParam(value="reviewerId")String reviewerId){
        Boolean result = reviewerService.deleteReviewerById(reviewerId);
        return Results.newSuccessResult(result);
    }


    //多重条件查询
    @RequestMapping(value = "/queryReviewer",method = RequestMethod.GET)
    public Result<List<Reviewer>> queryReviewer(@RequestParam(value ="reviewerId") String reviewerId,
                                     @RequestParam(value = "reviewerName") String reviewerName,
                                     @RequestParam(value = "reviewerSex")String reviewerSex,
                                     @RequestParam(value = "reviewerIdCard")String reviewerIdCard,
                                     @RequestParam(value = "reviewerTel")String reviewerTel,
                                     @RequestParam(value ="reviewerEmail") String reviewerEmail,
                                     @RequestParam(value ="startTime") String startTime,
                                     @RequestParam(value ="endTime") String endTime
                                     ){
        List<Reviewer>  result = reviewerService.queryReviewer(reviewerId,reviewerName,reviewerSex,reviewerIdCard,reviewerTel,reviewerEmail,startTime,endTime);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/queryAll", method = RequestMethod.GET)
    public Result<List<Reviewer>> queryAllReviewer(){
        List<Reviewer> result = reviewerService.queryAllReviewer();
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public Result<Boolean> loginReviewer( @RequestParam(value = "reviewerTel") String reviewerTel,
                                  @RequestParam(value = "reviewerPwd")String reviewerPwd){
        boolean result = reviewerService.login(reviewerTel,reviewerPwd);
        return Results.newSuccessResult(result);
    }



}
