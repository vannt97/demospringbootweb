package com.vannt97.demospringbootweb.services;

import com.vannt97.demospringbootweb.model.AccountModel;

import java.util.ArrayList;

public interface AccountServices {
    void insert(AccountModel accountModel);
    AccountModel findId(int id);
    void update(AccountModel accountModel);

    void printSize();

    ArrayList<AccountModel> getAll();
}
