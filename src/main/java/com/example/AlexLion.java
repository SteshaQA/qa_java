package com.example;

import java.util.List;

public class AlexLion extends Lion {


    public static final String SEXALEX = "Самец";

    public AlexLion(Family feline) throws Exception {
        super(SEXALEX, feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
