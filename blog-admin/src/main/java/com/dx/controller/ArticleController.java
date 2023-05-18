package com.dx.controller;

import com.dx.domain.ResponseResult;
import com.dx.domain.dto.AddArticleDto;
import com.dx.domain.dto.ArticleListDto;
import com.dx.domain.vo.PageVo;
import com.dx.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseResult add(@RequestBody AddArticleDto article){
        return articleService.add(article);
    }

    @GetMapping("/list")
    public ResponseResult<PageVo> articleList(Integer pageNum, Integer pageSize, ArticleListDto articleListDto){
        return articleService.articleList(pageNum, pageSize, articleListDto);
    }
}