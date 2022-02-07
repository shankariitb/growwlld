package com.groww.lld.repository;

import com.groww.lld.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class UserRepository implements RepositoryInterface<Integer,User>{

    private static HashMap<Integer, User> userHashMap = new HashMap<Integer, User>();
    @Override
    public void saveEntity(Integer k, User v) {
        userHashMap.put((Integer) k,(User)v);
    }

    @Override
    public User getEntity(Integer o) {
        return  userHashMap.get((Integer)o);
    }
}
