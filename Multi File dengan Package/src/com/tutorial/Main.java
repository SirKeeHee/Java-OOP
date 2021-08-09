package com.tutorial;

//keyword import untuk package eksternal
import com.terminal.Terminal;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ujang");
        Player player2 = new Player("Anto");
        Player player3 = new Player("Kojiro");
        player1.show();
        player2.show();
        player3.show();

        Terminal.log("Kojiro sakti kali kau");
    }
}
