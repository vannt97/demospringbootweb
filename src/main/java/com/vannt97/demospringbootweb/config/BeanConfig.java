package com.vannt97.demospringbootweb.config;

import com.vannt97.demospringbootweb.model.UserModel;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class  BeanConfig {
        @Bean
        public UserModel userModel(){
            UserModel userModel1 = new UserModel();
            userModel1.setName("van");
            userModel1.setName("12");
            return  userModel1;
        }
}
