package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //overloading pada constructor
        Player player1 = new Player("Tsubasa");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Hyuga");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //overloading methods

        int a = Matematika.tambah(13,18);
        System.out.println(a);

        double b = Matematika.tambah(3, 0.8);
        System.out.println(b);
    }
}
