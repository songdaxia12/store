package com.group2.store.store.service.impl;

import com.group2.store.store.entity.TAddress;
import com.group2.store.store.dao.TAddressDao;
import com.group2.store.store.service.TAddressService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TAddress)表服务实现类
 *
 * @author makejava
 * @since 2022-06-27 15:37:25
 */
@Service("tAddressService")
public class TAddressServiceImpl implements TAddressService {
    @Resource
    private TAddressDao tAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    @Override
    public TAddress queryById(Integer aid) {
        return this.tAddressDao.queryById(aid);
    }

    /**
     * 分页查询
     *
     * @param tAddress    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<TAddress> queryByPage(TAddress tAddress, PageRequest pageRequest) {
        long total = this.tAddressDao.count(tAddress);
        return new PageImpl<>(this.tAddressDao.queryAllByLimit(tAddress, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tAddress 实例对象
     * @return 实例对象
     */
    @Override
    public TAddress insert(TAddress tAddress) {
        this.tAddressDao.insert(tAddress);
        return tAddress;
    }

    /**
     * 修改数据
     *
     * @param tAddress 实例对象
     * @return 实例对象
     */
    @Override
    public TAddress update(TAddress tAddress) {
        this.tAddressDao.update(tAddress);
        return this.queryById(tAddress.getAid());
    }

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer aid) {
        return this.tAddressDao.deleteById(aid) > 0;
    }
}
