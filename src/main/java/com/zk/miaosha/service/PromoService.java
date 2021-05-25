package com.zk.miaosha.service;


import com.zk.miaosha.service.model.PromoModel;

/**
 * @Auther: zuokun
 * @Date: 2021/4/01
 * @Description:
 */
public interface PromoService {
    //根据itemid获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
