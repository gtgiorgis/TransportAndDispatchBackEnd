package com.chellena.transportAndDispatch.service;

import com.chellena.transportAndDispatch.model.DriverInfo;
import com.chellena.transportAndDispatch.repository.DriverInfoRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@NoArgsConstructor
public class DriverInfoService {
    private DriverInfoRepository driverInfoRepository;

    @Autowired
    public DriverInfoService(DriverInfoRepository driverInfoRepository) {
        this.driverInfoRepository = driverInfoRepository;
    }

    public List<DriverInfo> getAllDriverInfo() {
        return driverInfoRepository.findAll();
    }

    public List<DriverInfo> getAllActiveDriverInfo() {
        List<DriverInfo> driverInfoList = driverInfoRepository.findAll();
        List<DriverInfo> activeDriverInfoList = new ArrayList<>();
        for (DriverInfo driverInfo: driverInfoList) {
            if(driverInfo.isActive()){
               activeDriverInfoList.add(driverInfo);
            }
        }
        return activeDriverInfoList;
//        Stream<DriverInfo> stream = driverInfoList.stream();
//        Predicate<DriverInfo> p = new Predicate<DriverInfo>() {
//            @Override
//            public boolean test(DriverInfo driverInfo) {
//                return driverInfo.isActive();
//            }
//        };
//        stream = stream.filter(p);
//        List<DriverInfo> listC = stream.collect(Collectors.toList());
//        return listC;
    }

    public List<DriverInfo> deleteAllDriverInfo() {
        List<DriverInfo> driverInfoList = driverInfoRepository.findAll();
        List<DriverInfo> deletedDriverInfoList = new ArrayList<>();
       for (int i =0; i<driverInfoList.size(); i++){
           DriverInfo driverInfo = driverInfoList.get(i);
           driverInfoRepository.delete(driverInfo);
           deletedDriverInfoList.add(driverInfo);
       }

    return  deletedDriverInfoList;
    }
}
