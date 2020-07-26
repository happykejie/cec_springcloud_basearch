package com.example.springbootdemoentity.entity.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME:IntelliJ IDEA
 * @PACKAGE_NAME: com.example.springbootdemoentity.entity.utils
 * @DESCRIPTION:
 * @NAME: CommonResult
 * @USER: cec zj
 * @DATE: 2020/7/26 0026 15:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;

    public  CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
