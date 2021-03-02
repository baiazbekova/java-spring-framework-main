package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long> {

    @Query("SELECT e from Employee e where e.email='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    //single bind parameter
    @Query("select e from Employee e where e.email=?1 ")
    Optional<Employee> getEmployeeByEmail(String email);

    //multiple bind parameter
    @Query("select e from Employee e  where e.email=?1 AND e.salary=?2 ")
    Optional <Employee> getEmployeeByEmailAndSalary(String email, int salary);

}
