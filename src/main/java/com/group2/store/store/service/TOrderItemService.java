package com.group2.store.store.service;

import com.group2.store.store.entity.TOrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TOrderItem)表服务接口
 *
 * @author makejava
 * @since 2022-06-27 15:37:28
 */
public interface TOrderItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TOrderItem queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tOrderItem  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<TOrderItem> queryByPage(TOrderItem tOrderItem, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tOrderItem 实例对象
     * @return 实例对象
     */
    TOrderItem insert(TOrderItem tOrderItem);

    /**
     * 修改数据
     *
     * @param tOrderItem 实例对象
     * @return 实例对象
     */
    TOrderItem update(TOrderItem tOrderItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
