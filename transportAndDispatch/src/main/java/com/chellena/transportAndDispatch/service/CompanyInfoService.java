package com.chellena.transportAndDispatch.service;

import com.chellena.transportAndDispatch.model.CompanyInfo;
import com.chellena.transportAndDispatch.repository.CompanyInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyInfoService {
    private CompanyInfoRepository companyInfoRepository;
    @Autowired
   public  CompanyInfoService(CompanyInfoRepository companyInfoRepository){
        this.companyInfoRepository= companyInfoRepository;
    }

public List<CompanyInfo>putAllCompanyInfo(List<CompanyInfo> companyInfoList){
        List<CompanyInfo> companyInfo = companyInfoRepository.saveAll(companyInfoList);

        return companyInfoList;
}

    public List<CompanyInfo> patchAllCompanyInfo(List<CompanyInfo> patchInfoList) {
        List<CompanyInfo> companyInfo = companyInfoRepository.saveAll(patchInfoList);
        return patchInfoList;
    }
}
