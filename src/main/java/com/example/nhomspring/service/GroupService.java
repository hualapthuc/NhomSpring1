package com.example.nhomspring.service;

import com.example.nhomspring.model.Group;
import com.example.nhomspring.model.Position;

import java.util.List;

public interface GroupService {
    public List<Group> getAllGroup();
    public void addGroup(Group group);
    public void deleteGroup(int id);
    public Group updateGroup(Group group);
    public Group getGroupById(Integer id);
}
