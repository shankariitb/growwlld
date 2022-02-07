package com.groww.lld.repository;

import com.groww.lld.domain.User;

import java.util.HashMap;

public interface BalanceInterface {

    public HashMap<User,Double> getAllBalances();
    public Double getUserBalance(User user);
    public void updateUserBalance(User user,Double balance);
}
