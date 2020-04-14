package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.UmsAdminMapper;
import com.niec.mall.dto.UmsAdminDto;
import com.niec.mall.dto.UserDto;
import com.niec.mall.entity.UmsAdmin;
import com.niec.mall.service.UmsAdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户表(UmsAdmin)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("umsAdminService")
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper,UmsAdmin> implements UmsAdminService {
    @Resource
    private UmsAdminMapper umsAdminMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdmin queryById(Long id) {
        return this.umsAdminMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin insert(UmsAdmin umsAdmin) {
        this.umsAdminMapper.insert(umsAdmin);
        return umsAdmin;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsAdminMapper.deleteById(id) > 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUmsAdmin(UmsAdminDto umsAdminDto) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminDto, umsAdmin, "id");
        String uuid = String.valueOf(System.currentTimeMillis() - 1300000000000L);

    }

    @Override
    public List<UserDto> getUserList() {
        System.out.println(11);
        System.out.println(56);
        return umsAdminMapper.selectUserDtoList();
    }

}