package com.xxx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 2021-11
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404
    private Integer code;
    private String message;
    private T    data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
