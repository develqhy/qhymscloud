package com.sun.springcloud.result;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResult<T> extends BaseResult{
    private T data;
}
