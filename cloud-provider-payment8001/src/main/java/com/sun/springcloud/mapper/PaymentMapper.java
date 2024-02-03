package com.sun.springcloud.mapper;

import com.sun.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
* @author qhy
* @createDate 2024-01-31 13:44:58
*/
public interface PaymentMapper {

    int create(Payment payment);

    int deletePaymentById(@Param("id") Long id);

    Payment getPaymentById(@Param("id") Long id);
}




