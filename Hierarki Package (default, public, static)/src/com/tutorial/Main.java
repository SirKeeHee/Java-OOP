package com.tutorial;

//ini mengimport class terminal
import com.terminal.terminal;

//mengimport static method dari teminal
import static com.terminal.terminal.log;


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ujang");
        player1.show();

        terminal.log("Menampilkan data dengan terminal.log");
        terminal.log(player1.getName());

        log("\nMenampilkan data dengan log saja");
        log(player1.getName());
    }
}
//ini tidak akan bisa, dan penggunaan private tidak direkomendasikan
//private class test{
//
//        }
