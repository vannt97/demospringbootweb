package com.vannt97.demospringbootweb.controller;

import com.vannt97.demospringbootweb.services.EmailService;
import com.vannt97.demospringbootweb.services.FacebookService;

public class HomeController {
//    private EmailService emailService = null;
//    private FacebookService facebookService = null;
    MessageService messageService;
    public  HomeController(MessageService messageService){
//        emailService = new EmailService();
//        facebookService = new FacebookService();
        this.messageService = messageService;
    }



    public void send(){
        this.messageService.sendMessage();
    }
}
