package com.niec.mall.service.impl;

import com.github.pagehelper.Page;
import com.niec.mall.dto.ProductDto;
import com.niec.mall.entity.PmsProduct;
import com.niec.mall.dao.PmsProductDao;
import com.niec.mall.enums.HackerBusinessEnum;
import com.niec.mall.exception.HackerBusinessException;
import com.niec.mall.service.PmsProductService;
import com.niec.mall.vo.PmsProductDto;
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
public class PmsProductServiceImpl implements PmsProductService {
    @Resource
    private PmsProductDao pmsProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProduct queryById(Long id) {
        return this.pmsProductDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProduct> queryAllByLimit(int offset, int limit) {
        return this.pmsProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProduct 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProduct insert(PmsProduct pmsProduct) {
        this.pmsProductDao.insert(pmsProduct);
        return pmsProduct;
    }

    /**
     * 修改数据
     *
     * @param pmsProduct 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProduct update(PmsProduct pmsProduct) {
        this.pmsProductDao.update(pmsProduct);
        return this.queryById(pmsProduct.getId());
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
        return this.pmsProductDao.deleteById(id) > 0;
    }

    /**
     *
     * @param productDto
     * @return
     */
    @Override
    public List<PmsProductDto> queryListByStatus(ProductDto productDto) {
        List<PmsProductDto> list = pmsProductDao.queryListByStatus(productDto.getId());
        Page<PmsProductDto> page = new Page<>(productDto.getPage(), productDto.getLimit());
        return list;
    }
}