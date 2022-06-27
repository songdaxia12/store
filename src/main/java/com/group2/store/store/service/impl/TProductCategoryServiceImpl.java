package com.group2.store.store.service.impl;

import com.group2.store.store.entity.TProductCategory;
import com.group2.store.store.dao.TProductCategoryDao;
import com.group2.store.store.service.TProductCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-06-27 15:37:30
 */
@Service("tProductCategoryService")
public class TProductCategoryServiceImpl implements TProductCategoryService {
    @Resource
    private TProductCategoryDao tProductCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TProductCategory queryById(Integer id) {
        return this.tProductCategoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tProductCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TProductCategory> queryByPage(TProductCategory tProductCategory, PageRequest pageRequest) {
        long total = this.tProductCategoryDao.count(tProductCategory);
        return new PageImpl<>(this.tProductCategoryDao.queryAllByLimit(tProductCategory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public TProductCategory insert(TProductCategory tProductCategory) {
        this.tProductCategoryDao.insert(tProductCategory);
        return tProductCategory;
    }

    /**
     * 修改数据
     *
     * @param tProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public TProductCategory update(TProductCategory tProductCategory) {
        this.tProductCategoryDao.update(tProductCategory);
        return this.queryById(tProductCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tProductCategoryDao.deleteById(id) > 0;
    }
}
