package com.example.nhomspring.controller;

import com.example.nhomspring.model.User;
import com.example.nhomspring.service.PositionService;
import com.example.nhomspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private PositionService positionService;
   @GetMapping("")
    public  String userList(Model model) {
        model.addAttribute("listUser",userService.getAllUser());
       model.addAttribute("positions", positionService.getAllPosition());
        return "list-user";
    }
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "all-list-user";
    }
    @GetMapping("/add-user")
   public String addUser(Model model) {
       model.addAttribute("user",new User());
        model.addAttribute("positions", positionService.getAllPosition());
       return "add-user";
   }
   @PostMapping("/save-user")
   public  String saveUser(@ModelAttribute User user,  BindingResult bindingResult, Model model) {
       this.userService.addUser(user);
       return "redirect:/user/";
   }
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
         User user = userService.getUserById(id);
         model.addAttribute("user", user);
         return "update-user";
    }
    @PostMapping ("/update-user")
    public String updateStudent(@ModelAttribute("student") User user, BindingResult result, Model model) {
       userService.update(user);
        return "redirect:/user/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
         userService.deleteUser(id);
        return "redirect:/user/";
    }
}
