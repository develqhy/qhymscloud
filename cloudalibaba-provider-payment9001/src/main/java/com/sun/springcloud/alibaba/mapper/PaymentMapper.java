package com.sun.springcloud.alibaba.mapper;

import com.sun.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author qhy
 * @create 2024-02-05 12:12
 */
public interface PaymentMapper {

    Payment getPaymentById(@Param("id") Long id);
}
