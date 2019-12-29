package com.brian.sprbootdemo.service;

import com.brian.sprbootdemo.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Brian in 0:19 2018/5/5
 */
@Service
public class UserService {
    private List<User> users;

    public List<User> findByUserNameOrEmail(String userName){
        List<User> result = users.stream().filter(x -> x.getName()
                .equalsIgnoreCase(userName)).collect(Collectors.toList());

        return result;
    }

    @PostConstruct
    private void iniDataForTesting(){
        users = new ArrayList<>();
        User user1 = new User("Jack", "password_Jack", "Jack@yahoo.com");
        User user2 = new User("Tom", "password_Tom", "Tom@yahoo.com");
        User user3 = new User("John", "password_John", "John@yahoo.com");
        User user4 = new User("Alise", "password_Alise", "Alise@yahoo.com");
        User user5 = new User("Marry", "password_Marry", "Marry@yahoo.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }
}
