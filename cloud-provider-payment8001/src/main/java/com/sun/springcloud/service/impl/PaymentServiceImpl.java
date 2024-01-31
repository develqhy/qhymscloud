package com.sun.springcloud.service.impl;

import com.sun.springcloud.entity.Payment;
import com.sun.springcloud.mapper.PaymentMapper;
import com.sun.springcloud.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author qhy
* @createDate 2024-01-31 13:44:58
*/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}




