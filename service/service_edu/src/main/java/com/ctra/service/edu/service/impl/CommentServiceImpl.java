package com.ctra.service.edu.service.impl;

import com.ctra.service.edu.entity.Comment;
import com.ctra.service.edu.mapper.CommentMapper;
import com.ctra.service.edu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author wl
 * @since 2020-05-17
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
