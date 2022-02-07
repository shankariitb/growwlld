package com.groww.lld.service;

import com.groww.lld.domain.Group;
import com.groww.lld.domain.User;
import com.groww.lld.repository.BalanceRepository;
import com.groww.lld.repository.GroupRepository;
import com.groww.lld.repository.RepositoryInterface;
import com.groww.lld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Set;


@Service
public class ServiceInterfaceImpl  implements  ServiceInterface{

//    UserRepository userRepository = new UserRepository();
//    GroupRepository groupRepository = new GroupRepository();
//    BalanceRepository balanceRepository = new BalanceRepository();

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private BalanceRepository balanceRepository;

    @Override
    public void splitBill(Integer groupId,User user,Integer totalBill){
        Group group = groupRepository.getEntity(groupId);
        Integer totalCount = group.getGroupMembers().size()-1;
        for(User user1 : group.getGroupMembers()){
            if(user1.getUserId()!=user.getUserId()){
                balanceRepository.updateUserBalance(user1, (double) (totalBill/totalCount));
            }
        }
    }

    /**
     * 
     * @param groupId
     * @return
     */

    @Override
    public HashMap<User,Double>showBalance(Integer groupId){
        HashMap<User,Double> result = balanceRepository.getAllBalances();
        result.forEach((k,v)  -> System.out.println(k.getName()+" " + v));
        return result;
    }

    @Override
    public void saveUser(User user){
        userRepository.saveEntity(user.getUserId(),user);
    }

    @Override
    public void saveGroup(Group group){
        groupRepository.saveEntity(group.getId(),group);
    }

}
