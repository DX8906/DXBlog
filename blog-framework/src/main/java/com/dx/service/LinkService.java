package com.dx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dx.domain.ResponseResult;
import com.dx.domain.entity.Link;

/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-04-29 23:57:09
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}

