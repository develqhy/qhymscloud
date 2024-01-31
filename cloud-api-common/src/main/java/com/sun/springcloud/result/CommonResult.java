package com.sun.springcloud.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shuo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String  msg;
    private T       data;

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }

}
