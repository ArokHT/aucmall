package scu.huangtao.aucmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.huangtao.aucmall.common.domain.Comment;
import scu.huangtao.aucmall.mapper.CommentMapper;

@Service
public class CommentService implements CommentServiceInt{
    @Autowired
    CommentMapper commentMapper;
    @Override
    public int insert(Comment cmt) {
        return commentMapper.insert(cmt);
    }

    @Override
    public int getCommentIdByOrderId(int orderId) {
        return commentMapper.getCommentId(orderId);
    }
}
