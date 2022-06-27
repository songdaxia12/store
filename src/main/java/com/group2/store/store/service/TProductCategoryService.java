package com.group2.store.store.service;

import com.group2.store.store.entity.TProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TProductCategory)表服务接口
 *
 * @author makejava
 * @since 2022-06-27 15:37:30
 */
public interface TProductCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProductCategory queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tProductCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TProductCategory> queryByPage(TProductCategory tProductCategory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tProductCategory 实例对象
     * @return 实例对象
     */
    TProductCategory insert(TProductCategory tProductCategory);

    /**
     * 修改数据
     *
     * @param tProductCategory 实例对象
     * @return 实例对象
     */
    TProductCategory update(TProductCategory tProductCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
