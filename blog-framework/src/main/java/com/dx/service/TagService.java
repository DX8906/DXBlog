package com.dx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dx.domain.ResponseResult;
import com.dx.domain.dto.TagListDto;
import com.dx.domain.entity.Tag;
import com.dx.domain.vo.PageVo;
import com.dx.domain.vo.TagVo;

import java.util.List;

/**
 * 标签(Tag)表服务接口
 *
 * @author makejava
 * @since 2023-05-08 10:07:42
 */
public interface TagService extends IService<Tag> {

    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);

    List<TagVo> listAllTag();
}

