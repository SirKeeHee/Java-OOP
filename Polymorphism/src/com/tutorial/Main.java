package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Kojiro");
        HeroStrength hero2 = new HeroStrength("Tsubasa");

        hero1.display();
        hero2.display();

        //polymorphic
        Hero hero3 = new HeroAgility("Misaki");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Soda");
        hero4.display();
        hero4.showoff();

        //tidak bisa atau error
//        HeroIntel hero4 = new HeroIntel("Soda");
//        hero4.display();

        //Array list (membuat list object yang berbeda class)
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; //casting

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        //method calls
//        kumpulanHero[3].showoff(); // tidak bisa
        hero4.showoff();

        //aplikasi polymorphism
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);

    }
}
