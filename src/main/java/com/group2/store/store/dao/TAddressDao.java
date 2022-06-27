package com.group2.store.store.dao;

import com.group2.store.store.entity.TAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TAddress)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-27 15:37:23
 */
public interface TAddressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    TAddress queryById(Integer aid);

    /**
     * 查询指定行数据
     *
     * @param tAddress 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<TAddress> queryAllByLimit(TAddress tAddress, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tAddress 查询条件
     * @return 总行数
     */
    long count(TAddress tAddress);

    /**
     * 新增数据
     *
     * @param tAddress 实例对象
     * @return 影响行数
     */
    int insert(TAddress tAddress);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TAddress> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TAddress> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TAddress> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TAddress> entities);

    /**
     * 修改数据
     *
     * @param tAddress 实例对象
     * @return 影响行数
     */
    int update(TAddress tAddress);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 影响行数
     */
    int deleteById(Integer aid);

}

