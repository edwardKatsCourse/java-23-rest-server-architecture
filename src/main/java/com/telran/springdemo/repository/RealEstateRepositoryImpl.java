package com.telran.springdemo.repository;

import com.telran.springdemo.model.RealEstate;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@Repository
public class RealEstateRepositoryImpl implements RealEstateRepository {

    private static Integer counter = 0;
    private static Set<RealEstate> realEstates = new TreeSet<>(Comparator.comparing(RealEstate::getId));

    //1, 2, 3 | 3

    //removed #2 | 2

    //add (size() + 1)
    @Override
    public RealEstate save(RealEstate realEstate) {
        realEstate.setId(++counter);
        realEstates.add(realEstate);
        return realEstate;
    }

    @Override
    public RealEstate update(Integer id, String city, String street, Double price) {

        RealEstate realEstate = realEstates
                .stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (realEstate != null) {
            if (city != null) {
                realEstate.setCity(city);
            }

            if (street != null) {
                realEstate.setCity(city);
            }

            if (price != null) {
                realEstate.setPrice(price);
            }
        }

//        realEstates.remove(realEstate);
//        realEstates.add(realEstate);
        return realEstate;
    }

    @Override
    public void delete(Integer id) {
        RealEstate realEstate = realEstates.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (realEstate != null) {
            realEstates.remove(realEstate);
        }
    }

    @Override
    public Set<RealEstate> getAll() {
        return realEstates;
    }

    @Override
    public RealEstate getById(Integer id) {
        return realEstates.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
