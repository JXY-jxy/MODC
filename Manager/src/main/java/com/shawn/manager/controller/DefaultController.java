package com.shawn.manager.controller;

import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Default;
import com.shawn.manager.service.impl.DefaultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @Autowired
    DefaultServiceImpl defaultService;

    @RequestMapping(value="/addDefault", method = RequestMethod.POST)
    public Result<Boolean> addDefault(@RequestParam(value ="defaultId") String defaultId,
                                     @RequestParam(value = "clientId") String clientId,
                                      @RequestParam(value = "clientName") String clientName,
                                      @RequestParam(value = "sponsorId") String sponsorId,
                                      @RequestParam(value = "sponsorName") String sponsorName,
                                      @RequestParam(value ="defaultState",defaultValue = "0") int defaultState,
                                      @RequestParam(value = "defaultRemark") String defaultRemark,
                                      @RequestParam(value ="defaultRete",defaultValue = "0") int defaultRete,
                                      @RequestParam(value ="defaultNotch",defaultValue = "0") int defaultNotch,
                                      @RequestParam(value ="defaultCancel",defaultValue = "0") int defaultCancel,
                                      @RequestParam(value ="defaultDelay",defaultValue = "0") int defaultDelay,
                                      @RequestParam(value ="defaultRelate",defaultValue = "0") int defaultRelate,
                                      @RequestParam(value ="defaultSubstitute",defaultValue = "0") int defaultSubstitute,
                                      @RequestParam(value ="defaultBankrupt",defaultValue = "0") int defaultBankrupt
                                     ){

        boolean result = defaultService.addDefault(defaultId,clientId,clientName,sponsorId,sponsorName,defaultState,
                defaultRemark,defaultRete,defaultNotch,defaultCancel,defaultDelay,
                defaultRelate,defaultSubstitute,defaultBankrupt);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/deleteDefaultById", method = RequestMethod.DELETE)
    public Result<Boolean> deleteDefaultById(@RequestParam(value="defaultId")String defaultId){
        Boolean result = defaultService.deleteDefaultById(defaultId);
        return Results.newSuccessResult(result);
    }


    //多重条件查询
    @RequestMapping(value = "/queryDefault",method = RequestMethod.GET)
    public Result<List<Default>> queryDefault(@RequestParam(value ="defaultId") String defaultId,
                                     @RequestParam(value = "defaultName") String defaultName,
                                     @RequestParam(value = "defaultSex")String defaultSex,
                                     @RequestParam(value = "defaultIdCard")String defaultIdCard,
                                     @RequestParam(value = "defaultTel")String defaultTel,
                                     @RequestParam(value ="defaultEmail") String defaultEmail,
                                     @RequestParam(value ="startTime") String startTime,
                                     @RequestParam(value ="endTime") String endTime
                                     ){
        List<Default>  result = defaultService.queryDefault(defaultId,defaultName,defaultSex,defaultIdCard,defaultTel,defaultEmail,startTime,endTime);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/queryAll", method = RequestMethod.GET)
    public Result<List<Default>> queryAllDefault(){
        List<Default> result = defaultService.queryAllDefault();
        return Results.newSuccessResult(result);
    }



}
