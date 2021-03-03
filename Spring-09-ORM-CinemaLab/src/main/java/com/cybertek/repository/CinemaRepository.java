package com.cybertek.repository;

import com.cybertek.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {

    //DERIVED QUERIES

    //Write a derived query to get cinema with a specific name
    Optional<Cinema> findByName(String name);

    //Write a derived query to read sorted the top 3 cinemas that contain a specific sponsored name
    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredName(String sponsoredName);

    ///Write a derived query to list all cinemas in a specific country
    List<Cinema> findAllByLocationCountry(String country);

    ///Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findAllBySponsoredNameOrName(String sponsoredName, String name);


    //JPQL Queries
    //Write a JPQL query to read the cinema name with a specific id
    @Query ("select c from Cinema c where c.id=?1")
   Optional <Cinema> readByName(int id);

    //Native

    //Write a native query to read all cinemas by location country
    @Query (value = "Select * from cinema c JOIN location l on l.id=c.location_id where l.country=?1", nativeQuery = true)
    List<Cinema>  retrieveAllByLocationCountry(String locationCountry);


}
