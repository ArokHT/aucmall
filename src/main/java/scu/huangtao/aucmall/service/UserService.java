package scu.huangtao.aucmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.huangtao.aucmall.common.domain.User;
import scu.huangtao.aucmall.mapper.UserMapper;

import java.util.List;

@Service
public class UserService implements UserServiceInt{
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String mail) {
        List<User> users=userMapper.selectUserByMail(mail);
        return users.size() > 0 ? users.get(0) : null;
    }

    @Override
    public int register(String nickname, String mail, String password, String sex) {
        User newUser=new User();
        newUser.setMail(mail);
        newUser.setNickname(nickname);
        newUser.setPassword(password);
        newUser.setSex(sex);
        newUser.setRewardPoint(0);
        newUser.setBalance(0);
        newUser.setIsDeleted(false);
        int insert  = userMapper.insert(newUser);
        return insert;
    }
}
