package com.group2.store.store.service;

import com.group2.store.store.entity.TCart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TCart)表服务接口
 *
 * @author makejava
 * @since 2022-06-27 15:37:26
 */
public interface TCartService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    TCart queryById(Integer cid);

    /**
     * 分页查询
     *
     * @param tCart       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<TCart> queryByPage(TCart tCart, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tCart 实例对象
     * @return 实例对象
     */
    TCart insert(TCart tCart);

    /**
     * 修改数据
     *
     * @param tCart 实例对象
     * @return 实例对象
     */
    TCart update(TCart tCart);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

}
