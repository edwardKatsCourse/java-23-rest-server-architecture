package com.telran.springdemo.controller;

import com.telran.springdemo.model.RealEstate;
import com.telran.springdemo.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class RealEstateController {

    @Autowired
    private RealEstateRepository realEstateRepository;

    /**
     * REST server
     * GET -> достаем информацию
     * POST -> сохраняем/передаем "тело запроса"
     * PUT -> обновляем
     * DELETE -> удаляем
     *
     */

    @PostMapping(/*localhost:8080*/"/houses")
    public RealEstate save(@RequestBody RealEstate realEstate) {
        return realEstateRepository.save(realEstate);
    }

    @GetMapping("/houses")
    public Set<RealEstate> getAll() {
        return realEstateRepository.getAll();
    }

    @GetMapping("/houses/{id}")
    public RealEstate getOne(@PathVariable("id") Integer identification) {
        return realEstateRepository.getById(identification);
    }

    @DeleteMapping("/houses/{identification}")
    public void delete(@PathVariable("identification") Integer id) {
        realEstateRepository.delete(id);
    }

    //house/1?city=Tel-Aviv&price=30000
    @PutMapping("/houses/{id}")
    public RealEstate update(
            @PathVariable("id") Integer id,
            @RequestParam(value = "price", required = false) Double price,
            @RequestParam(value = "city", required = false) String city,
            @RequestParam(value = "street", required = false) String street) {

        return realEstateRepository.update(id, city, street, price);

    }

}
