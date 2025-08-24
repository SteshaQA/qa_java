package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private final Family family;

    public Lion(String sex, Family family) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.family = family;
    }

    public int getKittens() {
        return family.getKittens();
    }

     public boolean doesHaveMane() {
        return hasMane;
     }

    public List<String> getFood() throws Exception {
        return family.getFood("Хищник");
    }
}
