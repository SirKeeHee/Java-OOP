package com.tutorial;

import com.terminal.terminal;

//visibility default
class Player{
    private String name;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
//        System.out.println("Player name = " + this.name);
        terminal.log("Menggunakan Terminal");
        terminal.log("Player name = " + this.name);
    }
}
