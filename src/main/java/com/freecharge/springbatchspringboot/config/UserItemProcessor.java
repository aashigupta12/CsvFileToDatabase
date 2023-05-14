package com.freecharge.springbatchspringboot.config;

import com.freecharge.springbatchspringboot.model.User;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {
        //input - user //output - user
        return user;
    }
}
