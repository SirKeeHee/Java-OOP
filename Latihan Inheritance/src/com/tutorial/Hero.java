package com.tutorial;

public class Hero{
    //attribute
    String name;
    double attackPower, health;

    //constructor
    Hero(String name, double attackInput, double healthInput){
        this.name = name;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    //method attack
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attacking " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health = this.health - damage;
    }

    void display(){
        System.out.println("\nName\t= " + this.name);
        System.out.println("Health\t= " + this.health);
        System.out.println("Power\t= " + this.attackPower);
    }
}