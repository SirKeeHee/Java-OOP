package com.tutorial;

//membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {

        //instaniasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Kevin Pranata";
        mahasiswa1.NIM = "181910065";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 3.7;
        mahasiswa1.umur = 18;


        System.out.println("\n================ DATA MAHASISWA =================\n");
        System.out.println("Nama Mahasiswa     : " + mahasiswa1.nama);
        System.out.println("NIM Mahasiswa      : " + mahasiswa1.NIM);
        System.out.println("Jurusan Mahasiswa  : " + mahasiswa1.jurusan);
        System.out.println("IPK Mahasiswa      : " + mahasiswa1.IPK);
        System.out.println("Umur Mahasiswa     : " + mahasiswa1.umur);

    }
}
