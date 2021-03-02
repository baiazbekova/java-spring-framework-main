package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
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

    //single named parameter
    @Query("select e from Employee e where e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);

    //multiple names parameters
    @Query ("select e from Employee e where e.firstName=: name OR e.salary=:salary")
    List<Employee> getEmployeeByFirstNameOrSalary(@Param("name") String name, @Param("salary") int salary);


    //not equal
    @Query("select e from Employee  e where e.salary<>?1")
    List<Employee> getEmployeeBySalaryNotEqual(int salary);

    //like, contains, starts with, ends with
    @Query ("select e from Employee e where e.firstName LIKE ?1")
    List<Employee> getEmployeeByFirstNameLike(String pattern);

    //less than
    @Query ("select e from Employee e where e.salary< ?1")
    List<Employee> getEmployeeBySalaryLessThan(int salary);

    //greater than
    @Query ("select e from Employee e where e.salary>?1")
    List<Employee> getEmployeeBySalaryMoreThan (int salary);

}
