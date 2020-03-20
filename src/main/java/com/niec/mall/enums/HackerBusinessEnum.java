package com.niec.mall.enums;

public enum HackerBusinessEnum {

    /**
     * 参数为空
     */
    BUSINESS_OBJECT_IS_NULL("M11001", "业务对象为空"),
    OPERATING_OBJECT_IS_NULL("M11002","操作对象为空"),
    UPDATA_OBJECT_IS_FAIL("M11003","更新失败"),
    COMMODITY_NOT_EXIST("M11004","商品不存在");
    private String errorCode;
    private String errorMessage;

    private HackerBusinessEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}