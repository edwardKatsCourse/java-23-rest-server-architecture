package com.telran.springdemo.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RealEstate {

    private Integer id;
    private String city;
    private String street;
    private Integer houseNumber;
    private Double price;
}

//class A {
//    public static void main(String[] args) {
//        RealEstate realEstate = new RealEstate(1, "Haifa", "Balfur", 11, 2000000.0);
//        System.out.println(realEstate.getCity());
//    }
//}
