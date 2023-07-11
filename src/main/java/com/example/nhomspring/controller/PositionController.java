package com.example.nhomspring.controller;

import com.example.nhomspring.model.Position;
import com.example.nhomspring.model.User;
import com.example.nhomspring.service.PositionService;
import com.example.nhomspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;
    @GetMapping("")
    public  String positionList(Model model) {
        model.addAttribute("listPosition",positionService.getAllPosition());
        return "list-position";
    }
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id, Model model) {
        Position position = positionService.getPositionById(id);
        model.addAttribute("position", position);
        return "update-user";
    }
    @GetMapping("/add-position")
    public String addPosition(Model model) {
        model.addAttribute("position",new Position());
        return "add-position";
    }
    @PostMapping("/save-position")
    public  String savePosition(@ModelAttribute Position position, BindingResult bindingResult, Model model) {
       this.positionService.addPosition(position);
        return "redirect:/position/";
    }
    @GetMapping("/delete/{id}")
    public String deletePosition(@PathVariable int id) {
      positionService.deletePosition(id);
        return "redirect:/position/";
    }
}
