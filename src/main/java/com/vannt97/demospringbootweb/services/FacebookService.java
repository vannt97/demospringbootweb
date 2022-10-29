package com.vannt97.demospringbootweb.services;

import com.vannt97.demospringbootweb.controller.MessageService;

public class FacebookService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Facebook send message.....");
    }

    public void  featureFb(){

    }
}
