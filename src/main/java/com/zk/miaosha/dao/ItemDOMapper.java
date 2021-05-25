package com.zk.miaosha.dao;

import com.zk.miaosha.dataobject.ItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDOMapper {

    List<ItemDO> listItem();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    ItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Wed Mar 31 15:13:26 CST 2021
     */
    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id") Integer id, @Param("amount") Integer amount);

}