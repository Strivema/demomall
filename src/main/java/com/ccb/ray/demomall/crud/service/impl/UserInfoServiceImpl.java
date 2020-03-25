package com.ccb.ray.demomall.crud.service.impl;

import com.ccb.ray.demomall.crud.annotation.Master;
import com.ccb.ray.demomall.crud.entity.UserInfo;
import com.ccb.ray.demomall.crud.mapper.UserInfoMapper;
import com.ccb.ray.demomall.crud.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author Marie
 * @since 2020-03-25
 */
@Service
public class UserInfoServiceImpl  implements IUserInfoService {
    @Autowired
    private UserInfoMapper userMapper;


    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    @Override
    public int insert(UserInfo entity) {
        return userMapper.insert(entity);
    }

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    @Override
    public int deleteById(Serializable id) {
        return userMapper.deleteById(id);
    }

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    @Override
    public int updateById(UserInfo entity) {
        return userMapper.updateById(entity);
    }

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    @Master
    @Override
    public UserInfo selectById(Serializable id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<UserInfo> selectList() {
        return userMapper.selectList();
    }

}
