package com.ccb.ray.demomall.crud.service.impl;

import com.ccb.ray.demomall.crud.entity.UserInfo;
import com.ccb.ray.demomall.crud.mapper.UserInfoMapper;
import com.ccb.ray.demomall.crud.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author Marie
 * @since 2020-03-25
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
