package com.groww.lld.domain;

import java.util.HashMap;
import java.util.List;

public class Group {
    private int id;
    private List<User>groupMembers;

    public Group(){
    }


    public Group(int id,List<User>users){
        this.id = id;
        this.groupMembers = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }


}
