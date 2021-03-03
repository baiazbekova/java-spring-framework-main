package com.cybertek.repository;

import com.cybertek.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    //JPQL

    //Write a JPQL query tthat returns all genres
    @Query(value="select g from Genre g")
    List<Genre> readAllBy();

    //Native query
    //write a native query that returns genres by containing name
    @Query(value = "select * from Genre where name ILIKE concat ('%', ?1, '%')", nativeQuery = true)
    List<Genre> retrieveByName(String name);
}
