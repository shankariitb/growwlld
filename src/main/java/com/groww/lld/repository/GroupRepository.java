package com.groww.lld.repository;

import com.groww.lld.domain.Group;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class GroupRepository implements RepositoryInterface<Integer,Group>{

    private static HashMap<Integer, Group> groupHashMap = new HashMap<>();
    @Override
    public void saveEntity(Integer o, Group o2) {
        groupHashMap.put(o,o2);
    }

    @Override
    public Group getEntity(Integer o) {
        return groupHashMap.get(o);
    }
}
