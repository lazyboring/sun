package com.niec.mall.service.impl;

import com.niec.mall.dao.PmsBrandDao;
import com.niec.mall.entity.PmsBrand;
import com.niec.mall.enums.HackerBusinessEnum;
import com.niec.mall.exception.HackerBusinessException;
import com.niec.mall.service.PmsBrandService;
import com.niec.mall.vo.PmsBrandListDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌表(PmsBrand)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:50
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl implements PmsBrandService {
    @Resource
    private PmsBrandDao pmsBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsBrand queryById(Long id) {
        PmsBrand pmsBrand = pmsBrandDao.queryById(id);
        if (null== pmsBrand){
            throw new HackerBusinessException(HackerBusinessEnum.BUSINESS_OBJECT_IS_NULL);
        }
        return pmsBrand;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsBrand> queryAllByLimit(int offset, int limit) {
        return this.pmsBrandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsBrand 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBrand insert(PmsBrand pmsBrand) {
        this.pmsBrandDao.insert(pmsBrand);
        return pmsBrand;
    }

    /**
     * 修改数据
     *
     * @param pmsBrand 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBrand update(PmsBrand pmsBrand) {
        this.pmsBrandDao.update(pmsBrand);
        return this.queryById(pmsBrand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        PmsBrand pmsBrand = pmsBrandDao.queryById(id);
        if (null == pmsBrand){
            throw new HackerBusinessException(HackerBusinessEnum.OPERATING_OBJECT_IS_NULL);
        }

        return this.pmsBrandDao.deleteById(id) > 0;
    }

    /**
     * 通过工厂状态查询品牌列表
     * @param factoryStatus
     * @return
     */
    @Override
    public List<PmsBrandListDto> queryListByFactoryStatus(Integer factoryStatus) {

        return pmsBrandDao.queryListByFactoryStatus(factoryStatus);
    }
}