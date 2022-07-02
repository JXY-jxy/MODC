//package com.shawn.manager.service.impl;
//
//import com.shawn.manager.dao.ClientMapper;
//import com.shawn.manager.pojo.Client;
//import com.shawn.manager.service.ClientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ReviewerServiceImpl implements ClientService {
//
//    @Autowired
//    ClientMapper clientMapper;
//
//    @Override
//    public boolean addClient(String clientId,String clientName,String clientSex,String clientIdCard,String clientTel,String clientEmail,int clientState) {
////        JSONObject jsonObject = new JSONObject();
////        jsonObject.put("clientId",clientId);
////        jsonObject.put("clientName",clientName);
////        jsonObject.put("clientSex",clientSex);
////        jsonObject.put("clientIdCard",clientIdCard);
////        jsonObject.put("clientTel",clientTel);
////        jsonObject.put("clientEmail",clientEmail);
////        jsonObject.put("clientState",clientState);
//
//        return clientMapper.addClient(clientId,clientName,clientSex,clientIdCard,clientTel,clientEmail,clientState);
//    }
//
//    @Override
//    public boolean deleteClientById(String clientId) {
//        return clientMapper.deleteClientById(clientId);
//    }
//
//    @Override
//    public boolean updateClientStateToDefalut(String clientId) {
//        return clientMapper.updateClientStateToDefalut(clientId);
//    }
//
//    @Override
//    public boolean updateClientStateToReBirth(String clientId) {
//        return clientMapper.updateClientStateToReBirth(clientId);
//    }
//
//
//    @Override
//    public List<Client> queryClient(String clientId, String clientName, String clientSex, String clientIdCard, String clientTel, String clientEmail,String startTime,String endTime,int clientState) {
//        return clientMapper.queryClient(clientId,clientName,clientSex,clientIdCard,clientTel,clientEmail,startTime,endTime,clientState);
//    }
//
//    @Override
//    public List<Client> queryAllClient() {
//        return clientMapper.queryAllClient();
//    }
//}
