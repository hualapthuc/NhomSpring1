package com.example.nhomspring.controller;

import com.example.nhomspring.model.User;
import com.example.nhomspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
   @GetMapping("/")
    public  String userList(Model model) {
        model.addAttribute("listUser",userService.getAllUser());
        return "list-user";
    }
    @GetMapping("/add-user")
   public String addUser(Model model) {
       model.addAttribute("user",new User());
       return "add-user";
   }
   @PostMapping("/save-user")
   public  String saveUser(@ModelAttribute User user, BindingResult bindingResult,Model model) {
       userService.addUser(user);
       return "redirect:/user/";
   }
   
}
