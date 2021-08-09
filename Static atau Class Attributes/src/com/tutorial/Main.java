package com.tutorial;

class Display{
    static String type = "Display"; //static variable
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        //type = typeInput; //alternatif 1
        //this.type = typeInput; //alternatif 2
        Display.type = typeInput; //alternatif 3
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2= new Display("Handphone");
        display2.show();

        //tampilkan static vairable atau class variable

        //mencoba mengganti varible staticnya
        display1.setType("Brosur");

        System.out.println("\nMenampilkan static varable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        // kita dapat mengakes variable static dengan hanya memanggil nama class dengan nama variablenya
        // itu karena static variable akan menempel bersama classnya

        System.out.println("Static var dengan class = " + Display.type);

    }
}
