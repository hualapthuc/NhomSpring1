package com.example.nhomspring.service.Impl;

import com.example.nhomspring.model.Group;
import com.example.nhomspring.repository.GroupRepository;
import com.example.nhomspring.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;
    @Override
    public List<Group> getAllGroup() {
        return groupRepository.findAll();
    }

    @Override
    public void addGroup(Group group) {
           groupRepository.save(group);
    }

    @Override
    public void deleteGroup(int id) {
     groupRepository.deleteById(id);
    }

    @Override
    public Group updateGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group getGroupById(Integer id) {
        return groupRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("group not found"));
    }
}
