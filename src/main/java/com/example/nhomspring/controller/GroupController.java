package com.example.nhomspring.controller;

import com.example.nhomspring.model.Group;
import com.example.nhomspring.model.Position;
import com.example.nhomspring.service.GroupService;
import com.example.nhomspring.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("")
    public  String groupList(Model model) {
        model.addAttribute("listGroup",groupService.getAllGroup());
        return "list-group";
    }
    @GetMapping("/{id}")
    public String getGroupById(@PathVariable("id") Integer id, Model model) {
        Group group = groupService.getGroupById(id);
        model.addAttribute("group", group);
        return "all-list-group";
    }
    @GetMapping("/add-group")
    public String addGroup(Model model) {
        model.addAttribute("group",new Group());
        return "add-group";
    }
    @PostMapping("/save-group")
    public  String saveGroup(@ModelAttribute Group group, BindingResult bindingResult, Model model) {
       this.groupService.addGroup(group);
        return "redirect:/group/";
    }
    @GetMapping("/delete/{id}")
    public String deleteGroup(@PathVariable int id) {
        groupService.deleteGroup(id);
        return "redirect:/group/";
    }
}
