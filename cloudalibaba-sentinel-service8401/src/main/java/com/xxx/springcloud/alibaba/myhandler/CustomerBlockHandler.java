package com.xxx.springcloud.alibaba.myhandler;
//2021-12-1

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xxx.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}

