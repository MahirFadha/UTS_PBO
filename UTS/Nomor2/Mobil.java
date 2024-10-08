//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor2;

public class Mobil extends Kendaraan {
    private String warna;
    private String bensin;

    public Mobil(String brand, int speed, String warna, String bensin) {
        super(brand, speed);
        this.warna = warna;
        this.bensin = bensin;
    }

    public String getWarna() {
        return warna;
    }

    public String getBensin() {
        return bensin;
    }

    public void bergerak() {
        System.out.println("Mobil melaju dengan kecepatan " + speed);
    }
}
