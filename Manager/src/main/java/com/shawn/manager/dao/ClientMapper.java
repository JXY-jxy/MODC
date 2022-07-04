package com.shawn.manager.dao;

import com.shawn.manager.pojo.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ClientMapper {

    //添加客户
    boolean addClient(@Param("clientName")String clientName,@Param("clientSex")String clientSex,
                      @Param("clientIdCard")String clientIdCard, @Param("clientTel") String clientTel,@Param("clientEmail")String clientEmail,
                      @Param("clientState")int clientState,@Param("clientRete")int clientRete);

    //根据Id删除客户
    boolean deleteClientById(@Param("clientId") String clientId);

    //将状态更新为1违约
    boolean updateClientStateToDefalut(@Param("clientId") String clientId);

    //将状态更新为2重生
    boolean updateClientStateToReBirth(@Param("clientId") String clientId);

    //根据多重条件查询客户
    List<Client> queryClient(@Param("clientId")String clientId, @Param("clientName")String clientName, @Param("clientSex")String clientSex,
                             @Param("clientIdCard")String clientIdCard, @Param("clientTel") String clientTel, @Param("clientEmail")String clientEmail,
                             @Param("startTime")String startTime, @Param("endTime") String endTime, @Param("clientState")int clientState,@Param("clientRete")int clientRete);

    //查询所有客户
    List<Client> queryAllClient();

}
