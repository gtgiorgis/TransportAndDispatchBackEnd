package com.chellena.transportAndDispatch.service;

import com.chellena.transportAndDispatch.model.CustomerInfo;
import com.chellena.transportAndDispatch.model.OrderInfo;
import com.chellena.transportAndDispatch.repository.CustomerInfoRepository;
import com.chellena.transportAndDispatch.repository.OrderInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderInfoService.class);
    private final OrderInfoRepository orderRepository;
    private final CustomerInfoRepository customerInfoRepository;

    @Autowired
    public OrderInfoService(OrderInfoRepository orderRepository, CustomerInfoRepository customerInfoRepository) {
        this.orderRepository = orderRepository;
        this.customerInfoRepository = customerInfoRepository;
    }

    public List<OrderInfo> getAllOrderInfo() {
        return orderRepository.findAll();
    }

    public OrderInfo getOrderInfo(String id) {
        return orderRepository.findById(id).get();
    }

//    public List<OrderInfo> postAllOrderInfo(List<OrderInfo> postOrderInfoList) {
//        List<OrderInfo> savedOrderInfoList = new ArrayList<>();
//        postOrderInfoList.forEach(orderInfo -> {
//            orderRepository.save(orderInfo);
//            savedOrderInfoList.add(orderInfo);
//        });
//        return savedOrderInfoList;
//    }

    public OrderInfo deleteOrderInfo(String id) {
        OrderInfo orderInfo = orderRepository.findById(id).get();
        orderRepository.delete(orderInfo);
        return orderInfo;
    }

    public List<OrderInfo> postCustomerOrderInfo(Long customerId, List<OrderInfo> orderInfoList) {
        List<OrderInfo> saveOrderInfoList = new ArrayList<>();
        CustomerInfo customerInfo = customerInfoRepository.findById(customerId).get();
        orderInfoList.forEach(orderInfo -> {
            orderInfo.setCustomerInfo(customerInfo);
            orderRepository.save(orderInfo);
            saveOrderInfoList.add(orderInfo);
        });

        return saveOrderInfoList;
    }

    public Map<Long, List<OrderInfo>> postMultipleCustomerOrderInfo(Map<Long, List<OrderInfo>> customerOrderMap) {
        Map<Long, List<OrderInfo>> savedCustomerOrderMap = new HashMap<>();
        for(Long customerId: customerOrderMap.keySet()){
            List<OrderInfo> orderInfoList = postCustomerOrderInfo(customerId, customerOrderMap.get(customerId));
            savedCustomerOrderMap.put(customerId, orderInfoList);
        }
        return savedCustomerOrderMap;
    }
}