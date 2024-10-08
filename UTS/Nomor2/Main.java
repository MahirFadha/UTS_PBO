//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor2;

public class Main {
    public static void main(String[] args) {
        Truk truk = new Truk("Truk", 20, "Bensin", 8);
        truk.bergerak();
        truk.kapasitas();

        Mobil mobil = new Mobil("Mitshubishi", 120, "Merah", "Pertalite");
        mobil.bergerak();

        SepedaMotor sm = new SepedaMotor("Yamaha", 115, 6);
        sm.setGear(3);
        sm.setSpeed(80);
        sm.bergerak();
    }

}
