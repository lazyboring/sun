package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.entity.PmsProductAttributeValue;
import com.niec.mall.mapper.PmsProductAttributeValueMapper;
import com.niec.mall.service.PmsProductAttributeValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductAttributeValueService")
public class PmsProductAttributeValueServiceImpl extends ServiceImpl<PmsProductAttributeValueMapper,PmsProductAttributeValue> implements PmsProductAttributeValueService {
    @Resource
    private PmsProductAttributeValueMapper pmsProductAttributeValueMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeValue queryById(Long id) {
        return this.pmsProductAttributeValueMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeValue insert(PmsProductAttributeValue pmsProductAttributeValue) {
        this.pmsProductAttributeValueMapper.insert(pmsProductAttributeValue);
        return pmsProductAttributeValue;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttributeValueMapper.deleteById(id) > 0;
    }
}