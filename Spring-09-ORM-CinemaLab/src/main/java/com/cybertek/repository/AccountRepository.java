package com.cybertek.repository;

import com.cybertek.entity.Account;
import com.cybertek.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository <Account, Long> {

    //-------DERIVED QUERIES------//

    //Write a derived query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findAllByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> findAllByRole(User role);

    //Write a derived query to list all accounts between range of ages
    List<Account> findALlByAgesBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findAllByAddressStartingWith(String address);

    //Write a derived query to sort the list of accounts with age
    List<Account> findByOOrderByAgeDesc();

    //------JPQL QUERIES-------//

    //Write a JPQL query that returns all accounts
    @Query("select a from Account a ")
    List<Account> getAllAccounts();

    //Write a JPQL query to list all admin accounts
    @Query("select a from Account a where a.role='admin'")
    List<Account> getAllAdminAccounts();

    //Write a JPQL query to sort all accounts by age
    @Query ("select a from Account a ORDER BY a.age desc")
    List<Account> getAllAccountsByAge(int age);



    //--------NATIVE QUERIES-------//

    //Write a native query to read all accounts with an age lower than a specific value
    @Query (value = "select * from account_details where age < ?1", nativeQuery = true)
    List<Account> readAccountsByAgeLower(int age);

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state, city
    //@Query(value = "select * from account_details where name ILIKE concat ('%', ?1, '%') OR
            //country ILIKE concat('%', ?1, '%')", nativeQuery=true)
    //List<Account> retrieveBySearchCriteria(String pattern);

}
