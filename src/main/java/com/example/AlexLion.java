package com.example;

import java.util.List;

public class AlexLion extends Lion {

    private final Family feline;
    public static final String SEXALEX = "Самец";

    public AlexLion(Family feline) throws Exception {
        super(SEXALEX, feline);
        this.feline = feline;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
