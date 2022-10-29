package com.vannt97.demospringbootweb.controller;

import com.vannt97.demospringbootweb.model.AccountModel;
import com.vannt97.demospringbootweb.model.UserModel;
import com.vannt97.demospringbootweb.services.AccountServices;
import com.vannt97.demospringbootweb.services.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomePageController {

//    @GetMapping("")
//    public Object index(){
//        UserModel userModel = new UserModel();
//        userModel.setAge("23");
//        userModel.setName("Van nguyen");
//        return userModel;
//    }

//    @GetMapping("")
//    public String index(){
//        MessageService messageService = new FacebookService();
//
//        ContactController contactController = new ContactController(messageService);
//
//
//        contactController.send();
////        homeController.send();
//        return "Hellowolr";
//    }
//    @Autowired
//    UserModel userModel;
//    @GetMapping
//    public String index(){
//        System.out.println(userModel.getName());
////        mih co the get set dc luon tren cai ham dc khai bao o bean
//        return "";
//    }

    @Autowired
    AccountServices accountServices;

    @GetMapping()
    public Object index(){
        AccountModel accountModel = new AccountModel();
        accountModel.setId(1);
        accountModel.setOwnerName("DDDD");
        accountModel.setBalance(120.33);

        AccountModel accountModel2 = new AccountModel();
        accountModel2.setId(1);
        accountModel2.setOwnerName("DDDD");
        accountModel2.setBalance(120.33);

        AccountModel accountModel3 = new AccountModel();
        accountModel3.setId(1);
        accountModel3.setOwnerName("DDDD");
        accountModel3.setBalance(120.33);


        accountServices.insert(accountModel);
        accountServices.insert(accountModel2);
        accountServices.insert(accountModel3);


accountServices.printSize();
        return accountServices.getAll();
    }

    @GetMapping("/detail")
    public  String detail(){
        return "Hello detail page";
    }
}
