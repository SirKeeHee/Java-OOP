package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    //getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

}
    class Lingkaran{
        private double diameter;

        Lingkaran(double diameter){
            this.diameter = diameter;
        }

        // setter
        public void setJari2(double jari2){
            this.diameter = jari2*2;
        }

        //getter
        public double getJari2(){
            return this.diameter/2;
        }

        //getter rumit
        public double getLuas(){
            return 3.14 * diameter * diameter/4;
        }
    }

public class Main {
    public static void main(String[] args) {

        Data object = new Data();
        //public
        object.intPublic = 18; // Write
        System.out.println("Public : " + object.intPublic); // Read

        //read only (bisa menggunakan getter)
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);

        //write only (hanya bisa menggunakan setter)
        object.setDoublePrivate(0.05);
        object.display();

        //gabungkan read dan write dengan setter dan getter
        Lingkaran lingkaran1 = new Lingkaran(5);
        System.out.println("Jari - Jari : " + lingkaran1.getJari2());
        System.out.println();

        lingkaran1.setJari2(14);
        System.out.println("Jari - Jari : " + lingkaran1.getJari2());
        System.out.println();

        lingkaran1.setJari2(7);
        System.out.println("Jari - Jari : " + lingkaran1.getJari2());
        System.out.println("Luas        : " + lingkaran1.getLuas());
    }
}
