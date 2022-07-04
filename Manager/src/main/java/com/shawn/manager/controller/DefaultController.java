package com.shawn.manager.controller;

import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Default;
import com.shawn.manager.service.impl.DefaultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/default")
public class DefaultController {

    @Autowired
    DefaultServiceImpl defaultService;

    @RequestMapping(value="/addDefault", method = RequestMethod.POST)
    public Result<Boolean> addDefault(
                                      @RequestParam(value = "clientId") String clientId,
                                      @RequestParam(value = "clientName") String clientName,
                                      @RequestParam(value = "sponsorId") String sponsorId,
                                      @RequestParam(value = "sponsorName") String sponsorName,
                                      @RequestParam(value ="defaultState",defaultValue = "0") int defaultState,
                                      @RequestParam(value = "defaultRemark") String defaultRemark,
                                      @RequestParam(value ="defaultSeverity",defaultValue = "0") int defaultSeverity,
                                      @RequestParam(value ="defaultNotch",defaultValue = "0") int defaultNotch,
                                      @RequestParam(value ="defaultCancel",defaultValue = "0") int defaultCancel,
                                      @RequestParam(value ="defaultDelay",defaultValue = "0") int defaultDelay,
                                      @RequestParam(value ="defaultRelate",defaultValue = "0") int defaultRelate,
                                      @RequestParam(value ="defaultSubstitute",defaultValue = "0") int defaultSubstitute,
                                      @RequestParam(value ="defaultBankrupt",defaultValue = "0") int defaultBankrupt,
                                      @RequestParam(value ="defaultExternal",defaultValue = "0") int defaultExternal
                                     ){

        boolean result = defaultService.addDefault(clientId,clientName,sponsorId,sponsorName,defaultState,
                defaultRemark,defaultSeverity,defaultNotch,defaultCancel,defaultDelay, defaultRelate,defaultSubstitute,
                defaultBankrupt,defaultExternal);
        return Results.newSuccessResult(result);
    }
    // 更新审核状态为1
    @RequestMapping(value="/updateDefalutStateToPass", method = RequestMethod.POST)
    public Result<Boolean> updateDefalutStateToPass(@RequestParam(value="defaultId")String defaultId){
        Boolean result = defaultService.updateDefalutStateToPass(defaultId);
        return Results.newSuccessResult(result);
    }

    // 更新审核状态为2
    @RequestMapping(value="/updateDefalutStateToFail", method = RequestMethod.POST)
    public Result<Boolean> updateDefalutStateToFail(@RequestParam(value="defaultId")String defaultId){
        Boolean result = defaultService.updateDefalutStateToFail(defaultId);
        return Results.newSuccessResult(result);
    }

    //多重条件查询
    @RequestMapping(value = "/queryDefault",method = RequestMethod.GET)
    public Result<List<Default>> queryDefault(@RequestParam(value ="defaultId") String defaultId,
                                              @RequestParam(value = "clientId") String clientId,
                                              @RequestParam(value = "clientName") String clientName,
                                              @RequestParam(value = "sponsorId") String sponsorId,
                                              @RequestParam(value = "sponsorName") String sponsorName,
                                              @RequestParam(value ="defaultState",defaultValue = "0") int defaultState,
                                              @RequestParam(value = "defaultRemark") String defaultRemark,
                                              @RequestParam(value ="defaultSeverity",defaultValue = "0") int defaultSeverity,
                                              @RequestParam(value ="defaultNotch",defaultValue = "0") int defaultNotch,
                                              @RequestParam(value ="defaultCancel",defaultValue = "0") int defaultCancel,
                                              @RequestParam(value ="defaultDelay",defaultValue = "0") int defaultDelay,
                                              @RequestParam(value ="defaultRelate",defaultValue = "0") int defaultRelate,
                                              @RequestParam(value ="defaultSubstitute",defaultValue = "0") int defaultSubstitute,
                                              @RequestParam(value ="defaultBankrupt",defaultValue = "0") int defaultBankrupt,
                                              @RequestParam(value ="defaultExternal",defaultValue = "0") int defaultExternal,
                                              @RequestParam(value ="startCreated")String startCreated,
                                              @RequestParam(value ="endCreated") String endCreated,
                                              @RequestParam(value ="startReviewed")String startReviewed,
                                              @RequestParam(value ="endReviewed") String endReviewed
                                     ){
        List<Default>  result = defaultService.queryDefault(defaultId,clientId,clientName,sponsorId,sponsorName,defaultState,
                defaultRemark,defaultSeverity,defaultNotch,defaultCancel,defaultDelay, defaultRelate,defaultSubstitute,
                defaultBankrupt,defaultExternal,startCreated,endCreated,startReviewed,endReviewed);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/queryAll", method = RequestMethod.GET)
    public Result<List<Default>> queryAllDefault(){
        List<Default> result = defaultService.queryAllDefault();
        return Results.newSuccessResult(result);
    }



}
