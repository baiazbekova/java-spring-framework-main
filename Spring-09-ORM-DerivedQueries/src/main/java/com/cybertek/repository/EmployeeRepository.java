package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    //display all employees with email address ''
    List<Employee> findAllByEmail(String email);

    //display all employees with firstname '' and lastname '' also show all employees with a email address ''
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees which have first name that does not have 'Sydney'
    List<Employee> findByFirstNameIsNot(String firstName);
}
