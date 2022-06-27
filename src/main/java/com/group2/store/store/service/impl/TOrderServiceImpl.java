package com.group2.store.store.service.impl;

import com.group2.store.store.entity.TOrder;
import com.group2.store.store.dao.TOrderDao;
import com.group2.store.store.service.TOrderService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TOrder)表服务实现类
 *
 * @author makejava
 * @since 2022-06-27 15:37:28
 */
@Service("tOrderService")
public class TOrderServiceImpl implements TOrderService {
    @Resource
    private TOrderDao tOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    @Override
    public TOrder queryById(Integer oid) {
        return this.tOrderDao.queryById(oid);
    }

    /**
     * 分页查询
     *
     * @param tOrder      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<TOrder> queryByPage(TOrder tOrder, PageRequest pageRequest) {
        long total = this.tOrderDao.count(tOrder);
        return new PageImpl<>(this.tOrderDao.queryAllByLimit(tOrder, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder insert(TOrder tOrder) {
        this.tOrderDao.insert(tOrder);
        return tOrder;
    }

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder update(TOrder tOrder) {
        this.tOrderDao.update(tOrder);
        return this.queryById(tOrder.getOid());
    }

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer oid) {
        return this.tOrderDao.deleteById(oid) > 0;
    }
}
