package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    //display all employees with email address ''
    List<Employee> findAllByEmail(String email);

    //display all employees with firstname '' and lastname '' also show all employees with a email address ''
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees which have first name that does not have 'Sydney'
    List<Employee> findByFirstNameIsNot(String firstName);

    //display all employees with salaries higher than sth
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //display all employees who have been hired btw '' and '' dates.
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //display all employees who dont have email
    List<Employee> findByEmailIsNull ();

}
