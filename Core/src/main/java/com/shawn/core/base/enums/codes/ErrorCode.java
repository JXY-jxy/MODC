package com.shawn.core.base.enums.codes;

public enum ErrorCode {

    UNAUTH(-201,"权限不足"),
    VERIFYERR(-200,"验证码错误"),
    NOTYPE(-101,"无该类型"),
    GENERROR(-100,"生成失败"),
    INSERTERR(-5,"插入失败"),
    DELETEERR(-4,"删除失败"),
    ACCOUNTORPASSWORDERR(-3,"账号或密码错误"),
    SELECTERR(-2,"查询失败"),
    UNKNOWN(-1,"未知错误"),
    SUCCESS(200,"成功");
    ;
    private int code;
    private String description;

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ErrorCode getDescriptionByCode(Integer code){
        for (ErrorCode temp : ErrorCode.values()){
            if (code.equals(temp.getCode()))
                return temp;
        }
        return ErrorCode.UNKNOWN;
    }
}