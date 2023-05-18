package com.dx.service;

import com.dx.domain.ResponseResult;
import com.dx.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
