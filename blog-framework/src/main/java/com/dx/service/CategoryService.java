package com.dx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dx.domain.ResponseResult;
import com.dx.domain.entity.Category;
import com.dx.domain.vo.CategoryVo;

import java.util.List;

/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-04-29 17:18:34
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();

    List<CategoryVo> listAllCategory();
}

