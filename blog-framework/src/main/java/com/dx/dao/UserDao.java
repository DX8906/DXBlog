package com.dx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dx.domain.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户表(User)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-30 15:24:39
 */
@Repository
public interface UserDao extends BaseMapper<User> {

}

