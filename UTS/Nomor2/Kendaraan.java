//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor2;

public abstract class Kendaraan {

    String brand;
    int speed;

    public Kendaraan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    abstract void bergerak();
}
