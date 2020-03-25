package com.ccb.ray.demomall.crud.service;

import com.ccb.ray.demomall.crud.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 学生信息表 服务类
 * </p>
 *
 * @author Marie
 * @since 2020-03-25
 */
public interface IUserInfoService {
    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    int insert(UserInfo entity);

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    int deleteById(Serializable id);

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    int updateById(UserInfo entity);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    UserInfo selectById(Serializable id);

    List<UserInfo> selectList();

}
