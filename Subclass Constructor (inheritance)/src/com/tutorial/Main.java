package com.tutorial;

//subclass



public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Misaki", 50); // ini memakai constructor superclass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Kojiro", 100);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Anto");
        hero3.display();
    }
}
