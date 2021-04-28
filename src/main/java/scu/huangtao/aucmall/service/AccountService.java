package scu.huangtao.aucmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.huangtao.aucmall.common.domain.Account;
import scu.huangtao.aucmall.mapper.AccountMapper;

import java.util.List;

@Service
public class AccountService implements AccountServiceInt{

    @Autowired
    AccountMapper accountMapper;
    @Override
    public int insert(Account record) {
        return accountMapper.insert(record);
    }

    @Override
    public Account getOneAccountById(int id) {
        List<Account> res = accountMapper.getOneAccountById(id);
        return res.size() > 0 ? res.get(0) : null;
    }
}
