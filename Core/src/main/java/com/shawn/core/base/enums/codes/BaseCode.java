package com.shawn.core.base.enums.codes;

public enum BaseCode {
    TEST_ERROR(-10000,"测试错误"),

    //工具类相关错误
    OSS_SIGNATURE_ERROR(-500,"oss签名失败"),

    //授权相关错误
    LOGIN_ERROR(-400,"登录失败,用户名或账号错误"),
    VERIFY_ERROR(-401,"验证码验证失败"),
    NO_USER(-402,"无此用户"),

    //图像生成相关错误
    GENERATE_ERROR(-300,"生成失败"),

    //数据库相关错误
    SELECT_ERROR(-200,"查询失败"),
    DELETE_ERROR(-201,"删除失败"),
    INSERT_ERROR(-202,"添加失败"),


    //消息队列相关错误
    SEND_ERROR(-100,"消息发送失败"),

    //基本错误和成功码
    UNAUTHORIZED(-3,"未授权"),
    REQUEST_PARAM_ERROR(-2,"请求参数错误"),
    UNKNOWN(-1,"未知错误"),
    SUCCESS(0,"成功")
    ;

    private int code;
    private String description;

    BaseCode(int code, String description) {
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