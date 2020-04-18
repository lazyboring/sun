package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.CommodityMapper;
import com.niec.mall.dto.CommodityDto;
import com.niec.mall.entity.Commodity;
import com.niec.mall.enums.HackerBusinessEnum;
import com.niec.mall.exception.HackerBusinessException;
import com.niec.mall.service.CommodityService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Commodity)表服务实现类
 *
 * @author makejava
 * @since 2020-03-19 20:13:34
 */
@Service("commodityService")
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {
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
     * 更新数据
     *
     * @param commodityDto
     * @return
     */
    @Override
    public CommodityDto update(CommodityDto commodityDto) {
        Commodity commodity = new Commodity();
        BeanUtils.copyProperties(commodityDto, commodity);
        int rstNum = baseMapper.updateById(commodity);
        if (rstNum != 1) {
            throw new HackerBusinessException(HackerBusinessEnum.COMMODITY_NOT_EXIST);
        }

        return commodityDto;
    }

    @Override
    public CommodityDto add(CommodityDto commodityDto) {
        Commodity commodity = new Commodity();
        BeanUtils.copyProperties(commodityDto,commodity,"id");
        baseMapper.insert(commodity);
        commodityDto.setId(commodity.getId());
        return commodityDto;
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