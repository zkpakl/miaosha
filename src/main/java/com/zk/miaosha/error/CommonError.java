package com.zk.miaosha.error;

/**
 * @Auther: zuokun
 * @Date: 2021/4/01
 * @Description:
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);


}
