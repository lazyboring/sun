package com.niec.mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.niec.mall.entity.User;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-04-02 15:10:05
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List query(String name, Integer age);

    List queryEmailIsNotNull(String name, Integer lowerAge, Integer higherAge);

    Page page(Integer page, Integer size, Integer age);

    Integer updateByNameAndAge(String name, Integer age);
}