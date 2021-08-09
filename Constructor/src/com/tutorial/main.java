package com.tutorial;

import java.util.*;

//class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

//class dengan constructor

    class Player{
        String Nama;
        String Posisi;
        String Club;

        //constructor dipanggil saat object pertama kali dibuat
//        Player(){
//            System.out.println("ini adalah constructor");
//        }

        //constructor dengan parameter
        Player(String inputNama, String inputPosisi, String inputClub){
            Nama = inputNama;
            Posisi =  inputPosisi;
            Club = inputClub;

            System.out.println(Nama);
            System.out.println(Posisi);
            System.out.println(Club);
        }
    }

public class main {
    public static void main(String[] args){

        Player player1 = new Player("Gosens","Left Back","Atalanta");
        Player player2 = new Player("Pedri","Midfielder","Barcelona");



//        Polos objectPolos = new Polos();
//        objectPolos.dataString = "polos";
//        objectPolos.dataInteger = 1;
//
//        System.out.println(objectPolos.dataString);
//        System.out.println(objectPolos.dataInteger);

    }
}
