package com.shawn.core.base;

import lombok.Data;

@Data
public class Result<T> {
    public int code;
    public String message;
    public boolean success = true;
    public T data;
    public Result(boolean success) {
        this.success = success;
    }
}
