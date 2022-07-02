package com.shawn.core.base.enums;

public enum  UserTypes {
    ADMIN(1,"认定人"),
    WXCHENXU(2,"审核人"),
    ZFB(3,"重生发起人"),
    WANGYE(3,"网页"),
    ;
    Integer uTypeId;
    String userType;

    UserTypes(int uTypeId, String userType) {
        this.uTypeId = uTypeId;
        this.userType = userType;
    }

    public void setuTypeId(int uTypeId) {
        this.uTypeId = uTypeId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getuTypeId() {
        return uTypeId;
    }

    public String getUserType() {
        return userType;
    }

    public static int getIdByDescription(String description){
        for (UserTypes user : UserTypes.values()){
            if (user.getUserType().equals(description))
                return user.getuTypeId();
        }
        return UserTypes.WANGYE.getuTypeId();
    }

    public static boolean isAdmin(Integer userType){
        return userType.equals(UserTypes.ADMIN.getuTypeId());
    }

}
