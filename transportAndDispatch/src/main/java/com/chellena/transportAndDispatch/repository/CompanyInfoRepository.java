package com.chellena.transportAndDispatch.repository;

import com.chellena.transportAndDispatch.model.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoRepository extends JpaRepository<CompanyInfo, Integer>{
  }
