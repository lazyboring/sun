package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.PmsProductAttributeMapper;
import com.niec.mall.entity.PmsProductAttribute;
import com.niec.mall.service.PmsProductAttributeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 商品属性参数表(PmsProductAttribute)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductAttributeService")
public class PmsProductAttributeServiceImpl extends ServiceImpl<PmsProductAttributeMapper,PmsProductAttribute> implements PmsProductAttributeService {
    @Resource
    private PmsProductAttributeMapper pmsProductAttributeMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttribute queryById(Long id) {
        return this.pmsProductAttributeMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param pmsProductAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttribute insert(PmsProductAttribute pmsProductAttribute) {
        this.pmsProductAttributeMapper.insert(pmsProductAttribute);
        return pmsProductAttribute;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttributeMapper.deleteById(id) > 0;
    }
}