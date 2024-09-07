package io.github.tinemyumi.tinemyumi_webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.tinemyumi.tinemyumi_webapp.model.Company;
import io.github.tinemyumi.tinemyumi_webapp.model.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyController {

    private final CompanyRepository CompanyRepository;

    @GetMapping
    public List<Company> getAllCompanies(){
        return CompanyRepository.findAll();
    }

    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return CompanyRepository.save(company);
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        return CompanyRepository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
    }

    @PutMapping("/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company companyInfo) {
        Company company = CompanyRepository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
        company.setName(companyInfo.getName());
        company.setAddress(companyInfo.getAddress());
        company.setEmail(companyInfo.getEmail());
        company.setPhone(companyInfo.getPhone());
        return CompanyRepository.save(company);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        CompanyRepository.deleteById(id);
    }
}
