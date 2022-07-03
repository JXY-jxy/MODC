package com.shawn.core.base;

import com.shawn.core.base.enums.codes.BaseCode;

public class Results {
    public static <T> Result<T> newFailResult(BaseCode error){
        return newResult(null,error.getDescription(),error.getCode(),false);
    }

    public static <T> Result<T> newFailResult(String message){
        return newResult(null,message,-10000,false);
    }

    public static <T> Result<T> newSuccessResult(T data){
        return newResult(data,"success",200,true);
    }

    public static <T> Result<T> newResult(T data, String message, int code, boolean success){
        Result<T> result = new Result<>(success);
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
