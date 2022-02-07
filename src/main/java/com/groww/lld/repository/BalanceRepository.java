package com.groww.lld.repository;

import com.groww.lld.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class BalanceRepository implements BalanceInterface{

    private static HashMap<User,Double> balanceHashMap = new HashMap<>();

    public HashMap<User,Double> getAllBalances(){
        return balanceHashMap;
    }

    public Double getUserBalance(User user){
        return balanceHashMap.get(user);
    }

    public void updateUserBalance(User user,Double balance){
        balanceHashMap.put(user,balance);
    }
}
