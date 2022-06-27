package com.group2.store.store.controller;

import com.group2.store.store.entity.TCart;
import com.group2.store.store.service.TCartService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TCart)表控制层
 *
 * @author makejava
 * @since 2022-06-27 15:37:26
 */
@RestController
@RequestMapping("tCart")
public class TCartController {
    /**
     * 服务对象
     */
    @Resource
    private TCartService tCartService;

    /**
     * 分页查询
     *
     * @param tCart       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TCart>> queryByPage(TCart tCart, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tCartService.queryByPage(tCart, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TCart> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tCartService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tCart 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TCart> add(TCart tCart) {
        return ResponseEntity.ok(this.tCartService.insert(tCart));
    }

    /**
     * 编辑数据
     *
     * @param tCart 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TCart> edit(TCart tCart) {
        return ResponseEntity.ok(this.tCartService.update(tCart));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tCartService.deleteById(id));
    }

}

