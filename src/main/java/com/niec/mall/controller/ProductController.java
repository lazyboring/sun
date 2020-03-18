package com.niec.mall.controller;

import com.niec.mall.service.ProductService;
import com.niec.mall.vo.ProductDto;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author : niec
 * @description
 * @date : 2020-03-18 17:41
 */
@Api(description = "商品控制层")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @ApiOperation(value = "根据id查询商品")
    @GetMapping("/product")
    public ResultJson<ProductDto> getProduct(Long id){
        return ResultJson.ok(productService.queryById(id));
    };

    @ApiOperation(value = "增加商品")
    @PostMapping("/PostProduct")
    public ResultJson postProduct(@RequestBody ProductDto productDto){
        return ResultJson.ok(productService.addProduct(productDto));
    }
}
