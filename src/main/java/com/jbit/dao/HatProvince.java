package com.jbit.dao;

public class HatProvince {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_province.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_province.provinceID
     *
     * @mbggenerated
     */
    private Integer provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_province.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_province.id
     *
     * @return the value of hat_province.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_province.id
     *
     * @param id the value for hat_province.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_province.provinceID
     *
     * @return the value of hat_province.provinceID
     *
     * @mbggenerated
     */
    public Integer getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_province.provinceID
     *
     * @param provinceid the value for hat_province.provinceID
     *
     * @mbggenerated
     */
    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_province.province
     *
     * @return the value of hat_province.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_province.province
     *
     * @param province the value for hat_province.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}