//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor2;

public class Truk extends Kendaraan {
    String bensin;
    int roda;

    public Truk(String brand, int speed, String bensin, int roda) {
        super(brand, speed);
        this.bensin = bensin;
        this.roda = roda;
    }

    public String getBensin() {
        return bensin;
    }

    public int getRoda() {
        return roda;
    }

    public void bergerak() {
        System.out.println("Truk melaju dengan kecepatan " + speed);
    }

    public void kapasitas() {
        if (roda > 6) {
            System.out.println("Kapasitas Truk adalah 15");
        } else {
            System.out.println("Kapasitas Truk adalah 6");
        }
    }
}
