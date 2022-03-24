package com.chellena.transportAndDispatch.controller;

import com.chellena.transportAndDispatch.model.OrderInfo;
import com.chellena.transportAndDispatch.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    private final OrderInfoService orderInfoService;

    @Autowired
    public OrderController(OrderInfoService orderInfoService) {
        this.orderInfoService = orderInfoService;
    }

    @GetMapping("/getAllOrderInfo")
    public List<OrderInfo> getAllOrderInfo() {
        return orderInfoService.getAllOrderInfo();
    }

    @GetMapping("/getOrderInfo/{id}")
    public OrderInfo getOrderInfo(@PathVariable String id) {
        return orderInfoService.getOrderInfo(id);
    }

    @PostMapping("/postOrderInfo/{customer_id}")
    public List<OrderInfo> postCustomerOrderInfo(@PathVariable Long customer_id, @RequestBody List<OrderInfo> orderInfoList) {
        return this.orderInfoService.postCustomerOrderInfo(customer_id, orderInfoList);
    }

    @PostMapping("/postAllOrderInfo")
    public Map<Long, List<OrderInfo>> postMultipleCustomerOrderInfo(@RequestBody Map<Long, List<OrderInfo>> customerOrderMap) {
        return this.orderInfoService.postMultipleCustomerOrderInfo(customerOrderMap);
    }

    @DeleteMapping("/deleteOrderInfo/{id}")
    public OrderInfo deleteOrderInfo(@PathVariable String id) {
        return orderInfoService.deleteOrderInfo(id);
    }


}
