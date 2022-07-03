package com.shawn.manager.controller;

import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Sponsor;
import com.shawn.manager.service.impl.SponsorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sponsor")
public class SponsorController {

    @Autowired
    SponsorServiceImpl sponsorService;

    @RequestMapping(value="/addSponsor", method = RequestMethod.POST)
    public Result<Boolean> addSponsor(@RequestParam(value ="sponsorId") String sponsorId,
                                     @RequestParam(value = "sponsorName") String sponsorName,
                                     @RequestParam(value = "sponsorSex")String sponsorSex,
                                     @RequestParam(value = "sponsorIdCard")String sponsorIdCard,
                                     @RequestParam(value = "sponsorTel")String sponsorTel,
                                     @RequestParam(value ="sponsorEmail") String sponsorEmail
                                     ){

        boolean result = sponsorService.addSponsor(sponsorId,sponsorName,sponsorSex,sponsorIdCard,sponsorTel,sponsorEmail);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/deleteSponsorById", method = RequestMethod.DELETE)
    public Result<Boolean> deleteSponsorById(@RequestParam(value="sponsorId")String sponsorId){
        Boolean result = sponsorService.deleteSponsorById(sponsorId);
        return Results.newSuccessResult(result);
    }

    //多重条件查询
    @RequestMapping(value = "/querySponsor",method = RequestMethod.GET)
    public Result<List<Sponsor>> querySponsor(@RequestParam(value ="sponsorId") String sponsorId,
                                     @RequestParam(value = "sponsorName") String sponsorName,
                                     @RequestParam(value = "sponsorSex")String sponsorSex,
                                     @RequestParam(value = "sponsorIdCard")String sponsorIdCard,
                                     @RequestParam(value = "sponsorTel")String sponsorTel,
                                     @RequestParam(value ="sponsorEmail") String sponsorEmail,
                                     @RequestParam(value ="startTime") String startTime,
                                     @RequestParam(value ="endTime") String endTime
                                     ){
        List<Sponsor>  result = sponsorService.querySponsor(sponsorId,sponsorName,sponsorSex,sponsorIdCard,sponsorTel,sponsorEmail,startTime,endTime);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/queryAll", method = RequestMethod.GET)
    public Result<List<Sponsor>> queryAllSponsor(){
        List<Sponsor> result = sponsorService.queryAllSponsor();
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public Result<Sponsor> loginSponsor( @RequestParam(value = "sponsorTel") String sponsorTel,
                                  @RequestParam(value = "sponsorPwd")String sponsorPwd){
        Sponsor result = sponsorService.loginSponsor(sponsorTel,sponsorPwd);
        return Results.newSuccessResult(result);
    }

}
