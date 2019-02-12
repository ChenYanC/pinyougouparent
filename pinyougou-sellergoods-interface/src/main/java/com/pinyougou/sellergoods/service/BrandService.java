package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 品牌接口
 */
public interface BrandService {

    /**
     * 查询所有品牌
     * @return
     */
    public List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum  当前页面
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 品牌查询并分页
     * @param pageNum  当前页面
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize);

    /**
     * 添加品牌
     * @param tbBrand
     */
    public void add(TbBrand tbBrand);

    /**
     * 根据id查找品牌实体
     * @param id
     * @return
     */
    public TbBrand findOnde(Long id);

    /**
     * 修改
     * @param tbBrand
     */
    public void update(TbBrand tbBrand);

    /**
     * 删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 品牌下拉框数据
     */
    List<Map> selectOptionList();

}
