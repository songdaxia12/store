package com.group2.store.store.service.impl;

import com.group2.store.store.entity.TCart;
import com.group2.store.store.dao.TCartDao;
import com.group2.store.store.service.TCartService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TCart)表服务实现类
 *
 * @author makejava
 * @since 2022-06-27 15:37:26
 */
@Service("tCartService")
public class TCartServiceImpl implements TCartService {
    @Resource
    private TCartDao tCartDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public TCart queryById(Integer cid) {
        return this.tCartDao.queryById(cid);
    }

    /**
     * 分页查询
     *
     * @param tCart       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<TCart> queryByPage(TCart tCart, PageRequest pageRequest) {
        long total = this.tCartDao.count(tCart);
        return new PageImpl<>(this.tCartDao.queryAllByLimit(tCart, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tCart 实例对象
     * @return 实例对象
     */
    @Override
    public TCart insert(TCart tCart) {
        this.tCartDao.insert(tCart);
        return tCart;
    }

    /**
     * 修改数据
     *
     * @param tCart 实例对象
     * @return 实例对象
     */
    @Override
    public TCart update(TCart tCart) {
        this.tCartDao.update(tCart);
        return this.queryById(tCart.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.tCartDao.deleteById(cid) > 0;
    }
}
