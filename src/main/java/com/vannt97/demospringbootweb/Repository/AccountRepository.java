package com.vannt97.demospringbootweb.Repository;

import com.vannt97.demospringbootweb.model.AccountModel;

import java.util.ArrayList;

public interface AccountRepository {
    void insert(AccountModel accountModel);

    AccountModel findId(int id);

    void updateAccount(AccountModel accountModel);

    void printSizeList();

    ArrayList<AccountModel> getALL();
}
