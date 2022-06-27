package com.group2.store.store.dao;

import com.group2.store.store.entity.TProductCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TProductCategory)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-27 15:37:29
 */
public interface TProductCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProductCategory queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param tProductCategory 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TProductCategory> queryAllByLimit(TProductCategory tProductCategory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tProductCategory 查询条件
     * @return 总行数
     */
    long count(TProductCategory tProductCategory);

    /**
     * 新增数据
     *
     * @param tProductCategory 实例对象
     * @return 影响行数
     */
    int insert(TProductCategory tProductCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TProductCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TProductCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TProductCategory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TProductCategory> entities);

    /**
     * 修改数据
     *
     * @param tProductCategory 实例对象
     * @return 影响行数
     */
    int update(TProductCategory tProductCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

