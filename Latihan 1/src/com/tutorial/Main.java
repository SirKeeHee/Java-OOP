package com.tutorial;

import javax.sound.midi.Soundbank;
import java.lang.String;

//player
class Player{
    String Name;
    double Health;
    int level;
    //objects member
    Weapon Weapon;
    Armor Armor;

    Player (String Name, double Health){
        this.Name = Name;
        this.Health = Health;
    }

    void attack(Player Opponent){
        double Attackpower = this.Weapon.AttackPower;
        System.out.println(this.Name + " Attacking " + Opponent.Name + " with power " + Attackpower);
        Opponent.defence(Attackpower);
    }

    void defence(double Attackpower){
        //akan mengambil damage
        double Damage;
        if(this.Armor.DefencePower < Attackpower){
            Damage = Attackpower - this.Armor.DefencePower;
        } else {
            Damage = 0;
        }
        this.Health -= Damage;
        System.out.println(this.Name + " Get's Damage " + Damage);
    }

    void equipWeapon(Weapon Weapon){
        this.Weapon = Weapon;
    }

    void equipArmor(Armor Armor){
        this.Armor = Armor;
    }

    void display(){
        System.out.println("\nName : " + this.Name);
        System.out.println("Health : " + this.Health + " HP");
        this.Weapon.display();
        this.Armor.display();
    }
}

//senjata
class Weapon{
    double AttackPower;
    String Name;

    Weapon(String Name, double AttackPower){
        this.Name = Name;
        this.AttackPower = AttackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.Name + " , Attack : " + this.AttackPower);
    }
}

//armor
class Armor{
    double DefencePower;
    String Name;

    Armor(String Name, double DefencePower){
        this.Name = Name;
        this.DefencePower = DefencePower;
    }

    void display(){
        System.out.println("Armor : " + this.Name + " , Defence : " + this.DefencePower);
    }
}

public class Main {
    public static void main(String[] args) {

        //membuat object player
        Player Player1 = new Player("ujang",100);
        Player Player2 = new Player("anto",70);

        //membuat object senjata
        Weapon Pedang = new Weapon("Pedang",15);
        Weapon Tombak =  new Weapon("Tombak",5);

        //membuat object armor
        Armor bajuBaja =  new Armor("Baju Baja", 50);
        Armor kaosOblong = new Armor("Kaos Oblong",0);

        //player 1
        Player1.equipWeapon(Pedang);
        Player1.equipArmor(bajuBaja);
        Player1.display();

        //player 2
        Player2.equipWeapon(Tombak);
        Player2.equipArmor(kaosOblong);
        Player2.display();

        System.out.println("\nGLADIATOR ABAD INI");
        System.out.println("\nRONDE - 1");
        Player1.attack(Player2);
        Player1.display();
        Player2.display();
        System.out.println("\nRONDE - 2");
        Player2.attack(Player1);
        Player1.display();
        Player2.display();

    }
}
