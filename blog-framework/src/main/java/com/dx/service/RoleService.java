package com.dx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dx.domain.entity.Role;

import java.util.List;

/**
 * 角色信息表(Role)表服务接口
 *
 * @author makejava
 * @since 2023-05-09 00:06:36
 */
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);
}

