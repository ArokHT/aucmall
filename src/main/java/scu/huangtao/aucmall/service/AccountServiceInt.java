package scu.huangtao.aucmall.service;

import scu.huangtao.aucmall.common.domain.Account;

import java.util.List;

public interface AccountServiceInt {
    int insert(Account record);
    Account getOneAccountById(int id);
}
