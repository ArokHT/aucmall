package scu.huangtao.aucmall.service;

import scu.huangtao.aucmall.common.domain.Comment;

public interface CommentServiceInt {
    public int insert(Comment cmt);
    public int getCommentIdByOrderId(int orderId);
}
