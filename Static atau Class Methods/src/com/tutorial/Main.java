package com.tutorial;

import java.util.ArrayList;

class Player{
    private static int NumberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.NumberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show (){
        System.out.println("Player name = " + this.name);
    }

//    static method
    static void showNumberOfPlayer(){
        System.out.println("Number of Player = " + Player.NumberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }


}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Tsubasa");
        Player player2 = new Player("Hyuga");
        Player player3 = new Player("Misaki");
        Player player4 = new Player("Soda");

        Player.showNumberOfPlayer();

        System.out.println("Names = " + Player.getNames());
//        System.out.println("Names = " + player1.getNames()); // ini bisa dilakukan namun tidak disarankan

    }
}
