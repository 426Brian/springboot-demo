package com.brian.sprbootdemo.repository;

import com.brian.sprbootdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * {@link User}
 * Created by Brian in 18:07 2018/4/18
 */

@Repository
public class UserRepository {

    /**
     * 采用内存模型存储--> map
     */
    private ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     * @description: 保存用户
     * @params: [user]
     * @return: boolean
     * @author: Brian
     * @date: 2018/4/18 18:12
     */
    public boolean save(User user){

        // id 从1 开始
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);

        return repository.put(id, user) == null;
    }

    public Collection<User> findAll(){
        return repository.values();
    }
}
