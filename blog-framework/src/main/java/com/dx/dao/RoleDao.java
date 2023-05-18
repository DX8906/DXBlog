package com.dx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dx.domain.entity.Role;

import java.util.List;

/**
 * 角色信息表(Role)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-09 00:06:36
 */
public interface RoleDao extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long userId);
}

