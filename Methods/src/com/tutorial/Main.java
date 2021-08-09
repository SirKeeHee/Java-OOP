package com.tutorial;

//class

class Player{
    //Data pemain
    String Nama;
    String Posisi;

    //constructor
    Player(String inputNama, String inputPosisi){
        this.Nama = inputNama;
        this.Posisi = inputPosisi;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama Pemain   : " + this.Nama);
        System.out.println("Posisi Pemain : " + this.Posisi);
    }

    //method tanpa return dan dengan parameter
    void setNama(String Nama){
        this.Nama = Nama;
    }

    //method dengan return tapi tidak ada parameter
    String getNama(){
        return this.Nama;
    }
    String getPosisi(){
        return this.Posisi;
    }

    //method dengan preturn dan dengan parameter
    String sayHi(String Message){
        return Message + " juga, nama saya adalah " + this.Nama;
    }
}

public class Main {

    public static void main(String[] args) {
        Player Player1 =  new Player("Oyarzabal","Winger");
        //method
        Player1.show();
        Player1.setNama("Arzani");
        Player1.show();

        System.out.println(Player1.getNama());
        System.out.println(Player1.getPosisi());

        String data = Player1.sayHi("ganteng");
        System.out.println(data);
    }
}
