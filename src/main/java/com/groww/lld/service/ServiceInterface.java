package com.groww.lld.service;


import com.groww.lld.domain.Group;
import com.groww.lld.domain.User;

import java.util.HashMap;

public interface ServiceInterface {
    public void splitBill(Integer groupId,User user,Integer totalBill);

    public HashMap<User,Double> showBalance(Integer groupId);

    public void saveUser(User user);

    public void saveGroup(Group group);
}
