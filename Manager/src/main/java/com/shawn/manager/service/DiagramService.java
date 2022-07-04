package com.shawn.manager.service;

import com.shawn.manager.pojo.Client;
import com.shawn.manager.pojo.Industry;
import com.shawn.manager.pojo.Region;

import java.util.List;

public interface DiagramService {
    //查询所有行业
    List<Industry> queryAllIndustry();

    //查询所有区域
    List<Region> queryAllRegion();
}
