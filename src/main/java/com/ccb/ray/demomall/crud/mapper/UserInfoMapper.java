package com.ccb.ray.demomall.crud.mapper;

import com.ccb.ray.demomall.crud.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 学生信息表 Mapper 接口
 * </p>
 *
 * @author Marie
 * @since 2020-03-25
 */
@Component
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    List<UserInfo> selectList();
}
