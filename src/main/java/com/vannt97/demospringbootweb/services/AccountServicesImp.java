package com.vannt97.demospringbootweb.services;

import com.vannt97.demospringbootweb.Repository.AccountRepository;
import com.vannt97.demospringbootweb.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountServicesImp implements AccountServices{
    @Autowired
    AccountRepository accountRepository;

    @Override
    public void insert(AccountModel accountModel) {
        accountRepository.insert(accountModel);
    }

    @Override
    public AccountModel findId(int id) {
        return accountRepository.findId(id);
    }

    @Override
    public void update(AccountModel accountModel) {
        accountRepository.updateAccount(accountModel);
    }

    @Override
    public void printSize() {
        accountRepository.printSizeList();
    }

    @Override
    public ArrayList<AccountModel> getAll() {
        return accountRepository.getALL();
    }
}
