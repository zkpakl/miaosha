package com.zk.miaosha.service;

/**
 * @Auther: zuokun
 * @Date: 2021/4/01
 * @Description:
 */
//封装本地缓存操作类
public interface CacheService {
    //存方法
    void setCommonCache(String key, Object value);

    //取方法
    Object getFromCommonCache(String key);
}
