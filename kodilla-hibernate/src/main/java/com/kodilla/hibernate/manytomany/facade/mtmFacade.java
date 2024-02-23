package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mtmFacade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
    @Autowired
    public mtmFacade(CompanyDao companyDao, EmployeeDao employeeDao){
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
}
