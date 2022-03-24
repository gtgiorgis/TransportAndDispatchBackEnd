package com.chellena.transportAndDispatch.service;

import com.chellena.transportAndDispatch.model.CustomerInfo;
import com.chellena.transportAndDispatch.repository.CustomerInfoRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@NoArgsConstructor
public class CustomerInfoService {

    private CustomerInfoRepository customerInfoRepository;

    @Autowired
    public CustomerInfoService(CustomerInfoRepository customerInfoRepository) {
        this.customerInfoRepository = customerInfoRepository;
    }

    public List<CustomerInfo> getAllCustomerInfo(String... activeStatusArgs) {
        String activeStatus = activeStatusArgs[0].toUpperCase();
        switch (activeStatus) {
            case "IS_ACTIVE":
                return customerInfoRepository
                        .findAll()
                        .stream()
                        .filter(x -> x.isActive())
                        .collect(Collectors.toList());
            case "NOT_ACTIVE":
                return customerInfoRepository
                        .findAll()
                        .stream()
                        .filter(x -> !x.isActive())
                        .collect(Collectors.toList());
            default:
                return customerInfoRepository.findAll();
        }
    }

    public List<CustomerInfo> postCustomerInfo(List<CustomerInfo> customerInfoList) {
        return customerInfoRepository.saveAll(customerInfoList);
    }

    public CustomerInfo deleteCustomerInfo(Long id) {
        CustomerInfo customerInfo = customerInfoRepository.findById(id).get();
        customerInfoRepository.deleteById(id);
        return customerInfo;
    }

    public CustomerInfo getCustomerInfo(Long id) {
        return customerInfoRepository.findById(id).get();
    }

// Other options to use
//    public List<CustomerInfo> getAllActiveCustomerInfo() {
//        List<CustomerInfo> customerInfoList = customerInfoRepository.findAll();
//
//        for (int i = 0; i < customerInfoList.size(); i++) {
//            CustomerInfo ci = customerInfoList.get(i);
//            if (!ci.isActive()) {
//                customerInfoList.remove(ci);
//            }
//        }
//        return customerInfoList;

//        Option 2
//        Stream<CustomerInfo> stream = customerInfoList.stream();
//        Predicate<CustomerInfo> p = new Predicate<CustomerInfo>(){
//            @Override
//            public boolean test(CustomerInfo c) {
//                return true;
//            }
//        };
//        stream = stream.filter(p);
//        List<CustomerInfo> listC = stream.collect(Collectors.toList());

//          return customerInfoRepository
//                .findAll()
//                .stream()
//                .filter(x -> x.isActive())
//                .collect(Collectors.toList());
//    }
    }

