package com.vannt97.demospringbootweb.services;

import com.vannt97.demospringbootweb.controller.MessageService;

public class EmailService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Email send message....");
    }

    public void  featureEmail(){

    }
}
