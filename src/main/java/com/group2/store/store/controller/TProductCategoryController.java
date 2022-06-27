package com.group2.store.store.controller;

import com.group2.store.store.entity.TProductCategory;
import com.group2.store.store.service.TProductCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TProductCategory)表控制层
 *
 * @author makejava
 * @since 2022-06-27 15:37:29
 */
@RestController
@RequestMapping("tProductCategory")
public class TProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private TProductCategoryService tProductCategoryService;

    /**
     * 分页查询
     *
     * @param tProductCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TProductCategory>> queryByPage(TProductCategory tProductCategory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tProductCategoryService.queryByPage(tProductCategory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TProductCategory> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tProductCategoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tProductCategory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TProductCategory> add(TProductCategory tProductCategory) {
        return ResponseEntity.ok(this.tProductCategoryService.insert(tProductCategory));
    }

    /**
     * 编辑数据
     *
     * @param tProductCategory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TProductCategory> edit(TProductCategory tProductCategory) {
        return ResponseEntity.ok(this.tProductCategoryService.update(tProductCategory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tProductCategoryService.deleteById(id));
    }

}

