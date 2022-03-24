package com.chellena.transportAndDispatch.repository;

import com.chellena.transportAndDispatch.model.DriverInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverInfoRepository extends JpaRepository <DriverInfo, Integer>{

}
