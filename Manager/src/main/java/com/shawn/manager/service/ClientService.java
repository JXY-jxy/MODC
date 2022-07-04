package com.shawn.manager.service;

import com.shawn.manager.pojo.Client;
import com.shawn.manager.util.Service;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ClientService {
    //添加客户
    boolean addClient(String clientName,String clientSex,String clientIdCard,String clientTel,String clientEmail,int clientState,int clientRete);

    //根据Id删除客户
    boolean deleteClientById(String clientId);

    //将状态更新为1违约
    boolean updateClientStateToDefalut(String clientId);

    //将状态更新为2重生
    boolean updateClientStateToReBirth(String clientId);

    //根据多重条件查询客户
    List<Client> queryClient(String clientId, String clientName, String clientSex, String clientIdCard, String clientTel, String clientEmail, String startTime,String endTime,int clientState,int clientRete);

    //查询所有客户
    List<Client> queryAllClient();
}
