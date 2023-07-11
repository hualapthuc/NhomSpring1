package com.example.nhomspring.controller;

import com.example.nhomspring.model.Post;
import com.example.nhomspring.service.CompanyService;
import com.example.nhomspring.service.GroupService;
import com.example.nhomspring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private GroupService groupService;
    @GetMapping("")
    public  String postList(Model model) {
        model.addAttribute("listPost",postService.getAllPost());
        return "list-post";
    }
    @GetMapping("/{id}")
    public String getPostById(@PathVariable("id") Integer id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("posts", post);
        return "all-list-post";
    }
    @GetMapping("/add-post")
    public String addPost(Model model) {
        model.addAttribute("post",new Post());
        model.addAttribute("company_all", companyService.getAllCompany());
        model.addAttribute("groups", groupService.getAllGroup());
        return "add-post";
    }
    @PostMapping("/save-post")
    public  String savePost(@ModelAttribute Post post, BindingResult bindingResult, Model model) {
      this.postService.addPost(post);
        return "redirect:/post/";
    }
    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "redirect:/post/";
    }
}
