package com.shawn.manager.service.impl;

import com.shawn.manager.dao.DiagramMapper;
import com.shawn.manager.pojo.Industry;
import com.shawn.manager.pojo.Region;
import com.shawn.manager.service.DiagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : shawn
 * @date : 2022-07-04 19:27
 * @description :
 **/
@Service
public class DiagramServiceImpl implements DiagramService {

    @Autowired
    DiagramMapper diagramMapper;

    @Override
    public List<Industry> queryAllIndustry() {
        return diagramMapper.queryAllIndustry();
    }

    @Override
    public List<Region> queryAllRegion() {
        return diagramMapper.queryAllRegion();
    }
}
