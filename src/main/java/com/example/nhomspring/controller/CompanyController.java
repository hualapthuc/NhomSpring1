package com.example.nhomspring.controller;

import com.example.nhomspring.model.Company;
import com.example.nhomspring.model.Position;
import com.example.nhomspring.model.User;
import com.example.nhomspring.service.CompanyService;
import com.example.nhomspring.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @GetMapping("")
    public  String companyList(Model model) {
        model.addAttribute("listCompany",companyService.getAllCompany());
        return "list-company";
    }
    @GetMapping("/{id}")
    public String getCompanyById(@PathVariable("id") Integer id, Model model) {
        Company company = companyService.getCompanyById(id);
        model.addAttribute("company", company);
        return "all-list-company";
    }
    @GetMapping("/add-company")
    public String addCompany(Model model) {
        model.addAttribute("company",new Company());
        return "add-company";
    }
    @PostMapping("/save-company")
    public  String savePosition(@ModelAttribute Company company, BindingResult bindingResult, Model model) {
       this.companyService.addCompany(company);
        return "redirect:/company/";
    }
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
       Company company = companyService.getCompanyById(id);
        model.addAttribute("company", company);
        return "update-company";
    }
    @PostMapping ("/update-company")
    public String updateCompany(@ModelAttribute("company") Company company, BindingResult result, Model model) {
        companyService.updateCompany(company);
        return "redirect:/company/";
    }
    @GetMapping("/delete/{id}")
    public String deleteCompany(@PathVariable int id) {
         companyService.deleteCompany(id);
        return "redirect:/company/";
    }
}