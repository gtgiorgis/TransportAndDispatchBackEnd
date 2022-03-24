package com.chellena.transportAndDispatch.controller;

import com.chellena.transportAndDispatch.model.CompanyInfo;
import com.chellena.transportAndDispatch.service.CompanyInfoService;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
////////////use linkedList
@Controller
@RequestMapping("Chellena")
public class CompanyInfoController {
   private final CompanyInfoService companyInfoService;
   @Autowired
    public CompanyInfoController (CompanyInfoService companyInfoService){
       this.companyInfoService =companyInfoService;
}
    @RequestMapping(value="/putAllCompanyInfo", method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE )
    public List<CompanyInfo> putAllCompanyInfo(List<CompanyInfo> companyInfoList){
       return this.companyInfoService.putAllCompanyInfo(companyInfoList);
}

   // @CrossOrigim
    @PostMapping("/patchCompanyInfo")
    public List<CompanyInfo> patchCompanyInfo(List<CompanyInfo> companyInfoList){
       return  companyInfoList;

    }

}
