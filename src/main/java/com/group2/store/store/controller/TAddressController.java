package com.group2.store.store.controller;

import com.group2.store.store.entity.TAddress;
import com.group2.store.store.service.TAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TAddress)表控制层
 *
 * @author makejava
 * @since 2022-06-27 15:37:23
 */
@RestController
@RequestMapping("tAddress")
public class TAddressController {
    /**
     * 服务对象
     */
    @Resource
    private TAddressService tAddressService;

    /**
     * 分页查询
     *
     * @param tAddress    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TAddress>> queryByPage(TAddress tAddress, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tAddressService.queryByPage(tAddress, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TAddress> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tAddressService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tAddress 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TAddress> add(TAddress tAddress) {
        return ResponseEntity.ok(this.tAddressService.insert(tAddress));
    }

    /**
     * 编辑数据
     *
     * @param tAddress 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TAddress> edit(TAddress tAddress) {
        return ResponseEntity.ok(this.tAddressService.update(tAddress));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tAddressService.deleteById(id));
    }

}

