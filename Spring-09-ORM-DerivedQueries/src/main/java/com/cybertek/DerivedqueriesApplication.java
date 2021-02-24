package com.cybertek;

import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueriesApplication {
    @Autowired
    RegionRepository regionRepository;

    public static void main(String[] args) {
        SpringApplication.run(DerivedqueriesApplication.class, args);
    }

    @PostConstruct
    public void testRegions(){
        System.out.println("------Region start-------");
        System.out.println("findByCountry: "+ regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry: "+ regionRepository.findDistinctByCountry("United States"));
        System.out.println("findByCountryContaining: "+ regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryOrderBy: "+ regionRepository.findByCountryContainingOOrderByCountry("United"));






        System.out.println("------Region end------");

    }
}
