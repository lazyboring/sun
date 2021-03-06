package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.PmsProductMapper;
import com.niec.mall.entity.PmsProduct;
import com.niec.mall.enums.HackerBusinessEnum;
import com.niec.mall.exception.HackerBusinessException;
import com.niec.mall.service.PmsProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品信息(PmsProduct)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductService")
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper,PmsProduct> implements PmsProductService {
    @Resource
    private PmsProductMapper pmsProductMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProduct queryById(Long id) {
        return this.pmsProductMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param pmsProduct 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProduct insert(PmsProduct pmsProduct) {
        this.pmsProductMapper.insert(pmsProduct);
        return pmsProduct;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        PmsProduct pmsProduct = queryById(id);
        if (null == pmsProduct){
            throw new HackerBusinessException(HackerBusinessEnum.OPERATING_OBJECT_IS_NULL);
        }
        return this.pmsProductMapper.deleteById(id) > 0;
    }

    @Override
    public List<PmsProduct> query(Double price1, Double price2) {
//        QueryWrapper<PmsProduct> pmsProductQueryWrapper = new QueryWrapper<>();
//        pmsProductQueryWrapper.ge("price",price1).and().le("price",price2);
        LambdaQueryWrapper<PmsProduct> queryWrapper = new QueryWrapper<PmsProduct>().lambda();
        queryWrapper.ge(PmsProduct::getPrice,price1).le(PmsProduct::getPrice,price2);
        List<PmsProduct> pmsProductList = pmsProductMapper.selectList(queryWrapper);
        pmsProductList.forEach(System.out::println);
        return pmsProductList;
    }

    @Override
    public int update(PmsProduct pmsProduct) {

        PmsProduct pmsProduct1 = new PmsProduct();
        BeanUtils.copyProperties(pmsProduct,pmsProduct1);
        return baseMapper.insert(pmsProduct1);
    }


}