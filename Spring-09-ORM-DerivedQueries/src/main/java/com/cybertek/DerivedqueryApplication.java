package com.cybertek;

import com.cybertek.entity.Employee;
import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueryApplication {
    @Autowired
    RegionRepository regionRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(DerivedqueryApplication.class, args);
    }
    @PostConstruct
    public void testRegions(){

//        System.out.println("---------Regions start------------");
//        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
//        System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));
//        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));
//        System.out.println("findByCountryContainingOrderByCountry: " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
//        System.out.println("findTopByCountry "+ regionRepository.findTopByCountry("United States") );
//        System.out.println("---------Regions End------------");


    }
    @PostConstruct
    public void testDepartments(){
        //System.out.println("---------Departments start------------");
//        System.out.println("findAllByDepartment "+ departmentRepository.findAllByDepartment("Furniture"));
//        System.out.println("findAllByDepartment "+ departmentRepository.findAllByDepartment("Health"));
//        System.out.println("---------Departments end------------");
    }
    @PostConstruct
    public void testEmployees(){
        System.out.println("---------Employees start------------");
        //System.out.println(employeeRepository.findByFirstNameIsNot("Sydney"));
        System.out.println(employeeRepository.findBySalaryGreaterThan(14000));

        System.out.println("---------Employees end------------");

    }
}
