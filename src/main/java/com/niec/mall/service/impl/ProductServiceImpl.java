package com.niec.mall.service.impl;

import com.niec.mall.dao.PmsBrandDao;
import com.niec.mall.dao.PmsProductAttributeDao;
import com.niec.mall.service.ProductService;
import com.niec.mall.vo.ProductDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : niec
 * @description
 * @date : 2020-03-18 17:54
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private PmsBrandDao pmsBrandDao;

    @Resource
    private PmsProductAttributeDao pmsProductAttributeDao;


    @Override
    public ProductDto queryById(Long id) {
        return null;
    }
}
