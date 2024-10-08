package UTS.Nomor2;

public class SepedaMotor extends Kendaraan {
    int gear;

    public SepedaMotor(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void bergerak() {
        System.out.println("Sepeda Motor Melaju di Gear " + gear + " dengan kecepatan " + speed);
    }
}
