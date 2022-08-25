package com.cindy.service;

import com.cindy.pojo.Brand;
import com.cindy.pojo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {
    /**
     * query all
     * @return
     */
    List<Brand> selectAll();

    /**
     * add new data
     * @param brand
     */
    void add(Brand brand);

    /**
     * edit and update an existing brand
     * @param brand
     */
    void update(Brand brand);

    /**
     * delete a selected brand
     * @param id
     */
    void deleteById(int id);

    /**
     * delete all the selected brands
     * @param ids
     */
    void deleteByIds( int[] ids);

    /**
     * paging query
     * @param currentPage
     * @param pageSize
     * @return
     */
    PageBean<Brand> selectByPage(int currentPage, int pageSize);

    /**
     * paging querying by inputted conditions
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand);
}
