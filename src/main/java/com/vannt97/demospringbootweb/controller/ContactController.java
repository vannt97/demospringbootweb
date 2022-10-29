package com.vannt97.demospringbootweb.controller;

import com.vannt97.demospringbootweb.services.EmailService;

public class ContactController {
//    private EmailService emailService = null;
    MessageService messageService;
    public  ContactController(MessageService messageService){
        this.messageService = messageService;
    }

    public void send(){
        this.messageService.sendMessage();
    }
}
