package com.jbit.entity;

import com.jbit.dao.AsFunction;

public interface AsFunctionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    int insert(AsFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    int insertSelective(AsFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    AsFunction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(AsFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_function
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsFunction record);
}