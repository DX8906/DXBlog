package com.dx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dx.domain.ResponseResult;
import com.dx.domain.entity.User;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-05-01 12:05:20
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}

