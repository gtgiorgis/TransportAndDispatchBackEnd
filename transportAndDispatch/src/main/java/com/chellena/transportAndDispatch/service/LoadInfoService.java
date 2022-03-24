package com.chellena.transportAndDispatch.service;

import com.chellena.transportAndDispatch.model.LoadInfo;
import com.chellena.transportAndDispatch.repository.LoadInfoRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class LoadInfoService {
    private LoadInfoRepository loadInfoRepository;

    @Autowired
    public LoadInfoService(LoadInfoRepository loadInfoRepository) {
        this.loadInfoRepository = loadInfoRepository;
    }

    public List<LoadInfo> getAllLoadInfo() {
        return loadInfoRepository.findAll();
    }

    //Super interface
    //Sub interface
    //sub interface extends interface
    //save(Sub),save(Super)
    public List<LoadInfo> postAllLoadInfoList(List<LoadInfo> loadInfoList) {
        //psuedo-coding
        //What is the method trying to do?
        //What arguments does it expect?
        //What return does it want to return?
        List<LoadInfo> postAllLoadInfoList = loadInfoRepository.saveAll(loadInfoList);
        return postAllLoadInfoList;
    }
}