package com.dx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dx.domain.ResponseResult;
import com.dx.domain.dto.AddArticleDto;
import com.dx.domain.dto.ArticleListDto;
import com.dx.domain.entity.Article;
import com.dx.domain.vo.PageVo;

/**
 * 文章表(Article)表服务接口
 *
 * @author makejava
 * @since 2023-04-28 20:17:04
 */
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    ResponseResult<PageVo> articleList(Integer pageNum, Integer pageSize, ArticleListDto articleListDto);
}

