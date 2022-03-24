package com.chellena.transportAndDispatch.controller;

import com.chellena.transportAndDispatch.model.CustomerInfo;
import com.chellena.transportAndDispatch.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerInfoController {

    private final CustomerInfoService customerInfoService;

    @Autowired
    public CustomerInfoController(CustomerInfoService customerInfoService) {
        this.customerInfoService = customerInfoService;
    }

    @GetMapping("/getCustomerInfo/{id}")
    public CustomerInfo getCustomerInfo(@PathVariable Long id) {
        return this.customerInfoService.getCustomerInfo(id);
    }

    @GetMapping("/getAllCustomerInfo/{activeStatus}")
    public List<CustomerInfo> getAllCustomerInfo(@PathVariable String activeStatus) {
        return this.customerInfoService.getAllCustomerInfo(activeStatus);
    }

    @PostMapping("/postCustomerInfo")
    public List<CustomerInfo> postCustomerInfo(@RequestBody List<CustomerInfo> customerInfoList) {
        return this.customerInfoService.postCustomerInfo(customerInfoList);
    }

    @DeleteMapping("/deleteCustomerInfo/{id}")
    public CustomerInfo deleteCustomerInfo(@PathVariable Long id) {
        return this.customerInfoService.deleteCustomerInfo(id);
    }

}
