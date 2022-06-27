package com.group2.store.store.dao;

import com.group2.store.store.entity.TCart;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TCart)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-27 15:37:26
 */
public interface TCartDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    TCart queryById(Integer cid);

    /**
     * 查询指定行数据
     *
     * @param tCart    查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<TCart> queryAllByLimit(TCart tCart, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tCart 查询条件
     * @return 总行数
     */
    long count(TCart tCart);

    /**
     * 新增数据
     *
     * @param tCart 实例对象
     * @return 影响行数
     */
    int insert(TCart tCart);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TCart> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TCart> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TCart> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TCart> entities);

    /**
     * 修改数据
     *
     * @param tCart 实例对象
     * @return 影响行数
     */
    int update(TCart tCart);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

}

