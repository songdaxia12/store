package com.group2.store.store.service;

import com.group2.store.store.entity.TAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TAddress)表服务接口
 *
 * @author makejava
 * @since 2022-06-27 15:37:25
 */
public interface TAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    TAddress queryById(Integer aid);

    /**
     * 分页查询
     *
     * @param tAddress    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<TAddress> queryByPage(TAddress tAddress, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tAddress 实例对象
     * @return 实例对象
     */
    TAddress insert(TAddress tAddress);

    /**
     * 修改数据
     *
     * @param tAddress 实例对象
     * @return 实例对象
     */
    TAddress update(TAddress tAddress);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer aid);

}
