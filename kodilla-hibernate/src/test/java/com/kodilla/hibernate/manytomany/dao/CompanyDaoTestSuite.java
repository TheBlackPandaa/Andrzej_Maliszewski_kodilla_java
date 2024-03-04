package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.MtmFacade;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private MtmFacade mtmFacade;

    @Test
    void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMastersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMastersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    void testCompanyStartingWithSpecifiedThreeLetters(){
        //Given
        Company company = new Company("company");
        Company company1 = new Company("asdfas");
        Company company2 = new Company("asdfga");

        companyDao.save(company);
        int id = company.getId();
        companyDao.save(company1);
        int id1 = company1.getId();
        companyDao.save(company2);
        int id2 = company2.getId();
        //When
        List<Company> companies = companyDao.retrieveCompaniesWithThreeFirstLetters();
        //Then
        try{
            assertEquals(1, companies.size());
        }finally {
            //Cleanup
            companyDao.deleteById(id);
            companyDao.deleteById(id1);
            companyDao.deleteById(id2);
        }


    }
    @Test
    void testEmployeeWithTargetLastName(){
        //Given
        Employee employee = new Employee("John","Novak");
        Employee employee1= new Employee("Adrian", "Newey");
        Employee employee2= new Employee("Christian", "Horner");

        employeeDao.save(employee);
        int id = employee.getId();
        employeeDao.save(employee1);
        int id1= employee1.getId();
        employeeDao.save(employee2);
        int id2= employee2.getId();
        //When
        List<Employee> employees = employeeDao.retrieveEmployeeWithLastname("Horner");
        //then
        assertEquals(1, employees.size());
        //Cleanup
        employeeDao.deleteById(id);
        employeeDao.deleteById(id1);
        employeeDao.deleteById(id2);
    }

    @Test
    void testEmployeeWithRegex(){
        //Given
        Employee employee = new Employee("name1", "abcdef");
        Employee employee1 = new Employee("name2", "defghi");
        Employee employee2 = new Employee("name3", "ghijkl");

        employeeDao.save(employee);
        int id = employee.getId();
        employeeDao.save(employee1);
        int id1 = employee1.getId();
        employeeDao.save(employee2);
        int id2 = employee2.getId();
        //When
        List<Employee> employees = mtmFacade.retrieveEmployeesWithRegex("def");
        //Then
        assertEquals(2,employees.size());
        //Cleanup
        employeeDao.deleteById(id);
        employeeDao.deleteById(id1);
        employeeDao.deleteById(id2);
    }
}
