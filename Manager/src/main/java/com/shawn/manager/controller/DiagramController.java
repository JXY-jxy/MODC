package com.shawn.manager.controller;

import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Industry;
import com.shawn.manager.pojo.Region;
import com.shawn.manager.service.impl.DiagramServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DiagramController {

    @Autowired
    DiagramServiceImpl diagramService;

    @RequestMapping(value="/industry/queryAllIndustry", method = RequestMethod.GET)
    public Result<List<Industry>> queryAllIndustry(){
        List<Industry> result = diagramService.queryAllIndustry();
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/region/queryAllRegion", method = RequestMethod.GET)
    public Result<List<Region>> queryAllRegion(){
        List<Region> result = diagramService.queryAllRegion();
        return Results.newSuccessResult(result);
    }

}
