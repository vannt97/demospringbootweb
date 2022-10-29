package com.vannt97.demospringbootweb.Repository;

import com.vannt97.demospringbootweb.model.AccountModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class AccountRepositoryImp implements AccountRepository{
    ArrayList<AccountModel> list = new ArrayList<AccountModel>();
    @Override
    public void insert(AccountModel accountModel) {
        list.add(accountModel);
    }

    @Override
    public AccountModel findId(int id) {
        for(AccountModel accountModel:list){
            if(accountModel.getId() == id){
                return accountModel;
            }
        }
        return null;
    }

    @Override
    public void updateAccount(AccountModel accountModel) {
            AccountModel accountModel1 = findId(accountModel.getId());
        accountModel1.setId(accountModel.getId());
        accountModel1.setOwnerName(accountModel.getOwnerName());
        accountModel1.setBalance(accountModel.getBalance());
    }

    @Override
    public void printSizeList() {
        System.out.println("Size: " + list.size());
    }

    @Override
    public ArrayList<AccountModel> getALL() {
        return list;
    }
}
