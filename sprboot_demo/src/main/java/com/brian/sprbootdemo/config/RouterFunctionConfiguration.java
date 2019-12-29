package com.brian.sprbootdemo.config;


import com.brian.sprbootdemo.domain.User;
import com.brian.sprbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import java.util.Collection;

/**
 * 路由器函数 配置
 * Created by Brian in 18:33 2018/4/18
 */

@Configuration
public class RouterFunctionConfiguration {

    @Bean
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository) {

        return RouterFunctions.route(RequestPredicates.GET("/person/find/all"), request -> {
            Collection<User> users = userRepository.findAll();
            Flux<User> userFlux = Flux.fromIterable(users);
            return ServerResponse.ok().body(userFlux, User.class);
        });
    }



}
