package com.sun.springcloud.service;

import com.sun.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
* @author shuo
* @description 针对表【payment】的数据库操作Service
* @createDate 2024-01-31 13:44:58
*/
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
