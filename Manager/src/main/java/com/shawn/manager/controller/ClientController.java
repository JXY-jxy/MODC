package com.shawn.manager.controller;

import com.shawn.core.base.Result;
import com.shawn.core.base.Results;
import com.shawn.manager.pojo.Client;
import com.shawn.manager.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientServiceImpl clientService;

    @RequestMapping(value="/addClient", method = RequestMethod.POST)
    public Result<Boolean> addClient(
                                     @RequestParam(value = "clientName") String clientName,
                                     @RequestParam(value = "clientSex")String clientSex,
                                     @RequestParam(value = "clientIdCard")String clientIdCard,
                                     @RequestParam(value = "clientTel")String clientTel,
                                     @RequestParam(value ="clientEmail") String clientEmail,
                                     @RequestParam(value ="clientState",defaultValue = "0") int clientState,
                                     @RequestParam(value ="clientRete",defaultValue = "0") int clientRete
                                     ){

        boolean result = clientService.addClient(clientName,clientSex,clientIdCard,clientTel,clientEmail,clientState,clientRete);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/deleteClientById", method = RequestMethod.DELETE)
    public Result<Boolean> deleteClientById(@RequestParam(value="clientId")String clientId){
        Boolean result = clientService.deleteClientById(clientId);
        return Results.newSuccessResult(result);
    }

    // 将状态更新为1违约
    @RequestMapping(value="/updateClientStateToDefalut", method = RequestMethod.POST)
    public Result<Boolean> updateClientStateToDefalut(@RequestParam(value="clientId")String clientId){
        Boolean result = clientService.updateClientStateToDefalut(clientId);
        return Results.newSuccessResult(result);
    }

    // 将状态更新为2重生
    @RequestMapping(value="/updateClientStateToReBirth", method = RequestMethod.POST)
    public Result<Boolean> updateClientStateToReBirth(@RequestParam(value="clientId")String clientId){
        Boolean result = clientService.updateClientStateToReBirth(clientId);
        return Results.newSuccessResult(result);
    }

    //多重条件查询
    @RequestMapping(value = "/queryClient",method = RequestMethod.GET)
    public Result<List<Client>> queryClient(@RequestParam(value ="clientId") String clientId,
                                     @RequestParam(value = "clientName") String clientName,
                                     @RequestParam(value = "clientSex")String clientSex,
                                     @RequestParam(value = "clientIdCard")String clientIdCard,
                                     @RequestParam(value = "clientTel")String clientTel,
                                     @RequestParam(value ="clientEmail") String clientEmail,
                                     @RequestParam(value ="startTime") String startTime,
                                     @RequestParam(value ="endTime") String endTime,
                                     @RequestParam(value ="clientState") int clientState,
                                     @RequestParam(value ="clientRete") int clientRete
                                     ){
        List<Client>  result = clientService.queryClient(clientId,clientName,clientSex,clientIdCard,clientTel,clientEmail,startTime,endTime,clientState,clientRete);
        return Results.newSuccessResult(result);
    }

    @RequestMapping(value="/queryAll", method = RequestMethod.GET)
    public Result<List<Client>> queryAllClient(){
        List<Client> result = clientService.queryAllClient();
        return Results.newSuccessResult(result);
    }



}
