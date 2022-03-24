package com.chellena.transportAndDispatch.repository;

import com.chellena.transportAndDispatch.model.LoadInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadInfoRepository extends JpaRepository <LoadInfo, Integer>{

}
