package com.shawn.manager.controller;


import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Rebirth;
import com.shawn.manager.service.impl.RebirthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rebirth")
public class RebirthController {

    @Autowired
    RebirthServiceImpl rebirthService;

    @RequestMapping(value="/addRebirth", method = RequestMethod.POST)
    public Result<Boolean> addRebirth(
                                      @RequestParam(value = "defaultId") String defaultId,
                                      @RequestParam(value = "rebirthState",defaultValue = "0") String rebirthState,
                                      @RequestParam(value = "rebirthRemark") String rebirthRemark,
                                      @RequestParam(value = "rebirthRelieve",defaultValue = "0") String rebirthRelieve,
                                      @RequestParam(value ="rebirthSettle",defaultValue = "0") String rebirthSettle,
                                      @RequestParam(value ="rebirthChange",defaultValue = "0") String rebirthChange,
                                      @RequestParam(value ="rebirthReduce",defaultValue = "0") String rebirthReduce,
                                      @RequestParam(value ="rebirthPay",defaultValue = "0") String rebirthPay,
                                      @RequestParam(value ="rebirthRepay",defaultValue = "0") String rebirthRepay
    ){

        boolean result = rebirthService.addRebirth(defaultId, rebirthState, rebirthRemark, rebirthRelieve,
                rebirthSettle,  rebirthChange, rebirthReduce, rebirthPay, rebirthRepay);
        return Results.newSuccessResult(result);
    }
    // 更新审核状态为1
    @RequestMapping(value="/updateRebirthStateToPass", method = RequestMethod.POST)
    public Result<Boolean> updateRebirthStateToPass(@RequestParam(value="rebirthId")String rebirthId){
        Boolean result = rebirthService.updateRebirthStateToPass(rebirthId);
        return Results.newSuccessResult(result);
    }

    // 更新审核状态为2
    @RequestMapping(value="/updateRebirthStateToFail", method = RequestMethod.POST)
    public Result<Boolean> updateRebirthStateToFail(@RequestParam(value="rebirthId")String rebirthId){
        Boolean result = rebirthService.updateRebirthStateToFail(rebirthId);
        return Results.newSuccessResult(result);
    }

    //多重条件查询
    @RequestMapping(value = "/queryRebirth",method = RequestMethod.GET)
    public Result<List<Rebirth>> queryRebirth(@RequestParam(value = "rebirthId") String rebirthId,
                                              @RequestParam(value = "defaultId") String defaultId,
                                              @RequestParam(value = "clientName") String clientName,
                                              @RequestParam(value = "rebirthState",defaultValue = "0") String rebirthState,
                                              @RequestParam(value = "rebirthRemark") String rebirthRemark,
                                              @RequestParam(value = "rebirthRelieve",defaultValue = "0") String rebirthRelieve,
                                              @RequestParam(value = "rebirthSettle",defaultValue = "0") String rebirthSettle,
                                              @RequestParam(value = "rebirthChange",defaultValue = "0") String rebirthChange,
                                              @RequestParam(value = "rebirthReduce",defaultValue = "0") String rebirthReduce,
                                              @RequestParam(value = "rebirthPay",defaultValue = "0") String rebirthPay,
                                              @RequestParam(value = "rebirthRepay",defaultValue = "0") String rebirthRepay,
                                              @RequestParam(value = "startCreated")String startCreated,
                                              @RequestParam(value = "endCreated") String endCreated
    ){
        List<Rebirth> result = rebirthService.queryRebirth(rebirthId, defaultId,clientName, rebirthState, rebirthRemark, rebirthRelieve,
                rebirthSettle,  rebirthChange, rebirthReduce, rebirthPay, rebirthRepay,startCreated,endCreated);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/queryAll", method = RequestMethod.GET)
    public Result<List<Rebirth>> queryAllRebirth(){
        List<Rebirth> result = rebirthService.queryAllRebirth();
        return Results.newSuccessResult(result);
    }



}