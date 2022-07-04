package com.shawn.manager.dao;

import com.shawn.manager.pojo.Industry;
import com.shawn.manager.pojo.Region;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DiagramMapper {

    //查询所有行业
    List<Industry> queryAllIndustry();

    //查询所区域
    List<Region> queryAllRegion();

}
