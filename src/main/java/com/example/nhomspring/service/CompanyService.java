package com.example.nhomspring.service;

import com.example.nhomspring.model.Company;
import com.example.nhomspring.model.User;

import java.util.List;

public interface CompanyService {
    public List<Company> getAllCompany();
    public void addCompany(Company company);
    public void deleteCompany(int id);
    public void updateCompany(Company company);
    public Company getCompanyById(int id);
}
