package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis =  penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Percy Jackson","Riordan");
        buku1.display();

        //menampilkan address
        String addressbuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressbuku1);

        //assigment object
        Buku buku2 =  buku1;
        buku2.display();
        String addressbuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressbuku2);

        //karena buku1 dan buku2 berada pada address yang sama atau reference yang sama
        buku2.judul = "Jackson Percy";
        buku1.display();
        buku2.display();

        //kita akan masukan object kedalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();

    }
    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Rio Dan";
    }

}
