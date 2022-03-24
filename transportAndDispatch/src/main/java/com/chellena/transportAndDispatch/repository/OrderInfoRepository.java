package com.chellena.transportAndDispatch.repository;

import com.chellena.transportAndDispatch.model.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository <OrderInfo, String>{

}

