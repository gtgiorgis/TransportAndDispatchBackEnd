package com.chellena.transportAndDispatch.controller;

import com.chellena.transportAndDispatch.model.DriverInfo;
import com.chellena.transportAndDispatch.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverInfoController {

    private final DriverInfoService driverInfoService;

    @Autowired
    public DriverInfoController(DriverInfoService driverInfoService) {
        this.driverInfoService = driverInfoService;
    }

    @GetMapping("/getAllDriverInfo")
    public List<DriverInfo> getAllDriverInfo() {
        return driverInfoService.getAllDriverInfo();

    }

    @DeleteMapping("/deleteAllDriverInfo")
    public List<DriverInfo> deleteAllDriverInfo() {
        return driverInfoService.deleteAllDriverInfo();
    }
}
