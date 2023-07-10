package com.example.nhomspring.service.Impl;

import com.example.nhomspring.model.Company;
import com.example.nhomspring.repository.CompanyRepository;
import com.example.nhomspring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;


    @Override
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    @Override
    public void addCompany(Company company) {
     companyRepository.save(company);
    }

    @Override
    public void deleteCompany(int id) {
        companyRepository.deleteById(id);
    }

    @Override
    public void updateCompany(Company company) {
         companyRepository.save(company);
    }

    @Override
    public Company getCompanyById(int id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("company not found"));
    }
}
