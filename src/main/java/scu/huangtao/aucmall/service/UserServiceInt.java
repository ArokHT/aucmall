package scu.huangtao.aucmall.service;

import scu.huangtao.aucmall.common.domain.User;

public interface UserServiceInt {
    public User login(String mail);
    public int register(String nickname,String mail,String password,String sex);
}
