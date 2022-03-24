package com.chellena.transportAndDispatch.controller;

import com.chellena.transportAndDispatch.model.LoadInfo;
import com.chellena.transportAndDispatch.service.LoadInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoadInfoController {

    private final LoadInfoService loadInfoService;

    @Autowired
    public LoadInfoController(LoadInfoService loadInfoService){
        this.loadInfoService = loadInfoService;

    }

    @RequestMapping(value = "/getAllLoadInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
     public  List<LoadInfo> getAllLoadInfo(){
        return loadInfoService.getAllLoadInfo();

    }
    //client (UI framework such as Angular and React, browser,postman,
    // anything that initiates a request to a server)
    //
    //A server is anything that is not the client,
    // and the clients or other servers make request to it.
    //
    //A request can follow a specification, decided on the server side
    //An example of a specification is REST. Spring @RestController allows you
    //to create RESTful API'S. It means it is designed to follow the REST specification.
    //servers(java backend,c++ engines such as node.js, Rails framework for Ruby)
    //Different servers, Proxy servers, Database servers, Application Servers etc.
    //Spring framework, takes "consume" type/Media type, and converts it into a Java object.

    //postman sends JSON object {"testField":"testValue"} -> spring will
    //check annotation, to see what the controller is expecting
    //Then it will try to convert the type to a java object
    //what java object would it try to convert to?
    @RequestMapping(value = "/postLoadInfoList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<LoadInfo> postAllLoadInfoList(List<LoadInfo> loadInfoList){
        return loadInfoService.postAllLoadInfoList(loadInfoList);
    }
}
