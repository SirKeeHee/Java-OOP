package com.tutorial;

//inheritance adalah hubungan is-a

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Anto";
        System.out.println("Hero 1 :" + hero1.name);

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Ujang";
        System.out.println("Hero 2 :" + hero2.name);

        HeroIntellegent hero3 = new HeroIntellegent();
        hero3.name = "Ucup";
        System.out.println("Hero 3 :" + hero3.name);
    }
}
