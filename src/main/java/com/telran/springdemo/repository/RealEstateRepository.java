package com.telran.springdemo.repository;

import com.telran.springdemo.model.RealEstate;

import java.util.Set;

public interface RealEstateRepository {

    RealEstate save(RealEstate realEstate);
    RealEstate update(Integer id, String city, String street, Double price);
    void delete(Integer id);
    Set<RealEstate> getAll();
    RealEstate getById(Integer id);
}
