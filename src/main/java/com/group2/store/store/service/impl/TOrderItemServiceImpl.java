package com.group2.store.store.service.impl;

import com.group2.store.store.entity.TOrderItem;
import com.group2.store.store.dao.TOrderItemDao;
import com.group2.store.store.service.TOrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2022-06-27 15:37:29
 */
@Service("tOrderItemService")
public class TOrderItemServiceImpl implements TOrderItemService {
    @Resource
    private TOrderItemDao tOrderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TOrderItem queryById(Integer id) {
        return this.tOrderItemDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tOrderItem  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<TOrderItem> queryByPage(TOrderItem tOrderItem, PageRequest pageRequest) {
        long total = this.tOrderItemDao.count(tOrderItem);
        return new PageImpl<>(this.tOrderItemDao.queryAllByLimit(tOrderItem, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public TOrderItem insert(TOrderItem tOrderItem) {
        this.tOrderItemDao.insert(tOrderItem);
        return tOrderItem;
    }

    /**
     * 修改数据
     *
     * @param tOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public TOrderItem update(TOrderItem tOrderItem) {
        this.tOrderItemDao.update(tOrderItem);
        return this.queryById(tOrderItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tOrderItemDao.deleteById(id) > 0;
    }
}
