package com.zk.miaosha.service;


import com.zk.miaosha.error.BusinessException;
import com.zk.miaosha.service.model.UserModel;

/**
 * @author ZuoKun on 2021/3/30
 */
public interface UserService {
    /**
     * 通过用户ID获取用户对象的方法
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册功能
     * @param userModel
     * @throws BusinessException
     */
    void register(UserModel userModel) throws BusinessException;


    /**
     * 用户登陆接口
     * @param telphone:用户注册手机
     * @param encrptPassword:用户加密后的密码
     * @return
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
