package com.niec.mall.service.impl;

import com.niec.mall.dao.CommodityMapper;
import com.niec.mall.entity.Commodity;
import com.niec.mall.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Commodity)表服务实现类
 *
 * @author makejava
 * @since 2020-03-19 20:13:34
 */
@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityMapper commodityMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Commodity queryById(Long id) {
        return this.commodityMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param commodity 实例对象
     * @return 实例对象
     */
    @Override
    public Commodity insert(Commodity commodity) {
        this.commodityMapper.insert(commodity);
        return commodity;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.commodityMapper.deleteById(id) > 0;
    }
}