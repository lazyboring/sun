package com.niec.mall.service;

import com.niec.mall.vo.ProductDto;

/**
 * @author : niec
 * @description
 * @date : 2020-03-18 17:41
 */
public interface ProductService {

    ProductDto queryById(Long id);
}
