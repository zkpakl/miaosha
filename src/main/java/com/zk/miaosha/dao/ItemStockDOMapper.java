package com.zk.miaosha.dao;

import com.zk.miaosha.dataobject.ItemStockDO;
import org.apache.ibatis.annotations.Param;

public interface ItemStockDOMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int insert(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int insertSelective(ItemStockDO record);

    ItemStockDO selectByItemId(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    ItemStockDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int updateByPrimaryKeySelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int updateByPrimaryKey(ItemStockDO record);

    int decreaseStock(@Param("itemId") Integer itemId, @Param("amount") Integer amount);

}