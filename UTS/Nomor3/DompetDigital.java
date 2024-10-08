//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor3;

public class DompetDigital extends Transasksi implements Pembayaran {
    int saldo;

    public DompetDigital(String nomorTransaksi, int nominalTransaksi, int saldo) {
        super(nomorTransaksi, nominalTransaksi);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String sisaSaldo() {
        if (nominalTransaksi > saldo) {
            System.out.println("Saldo kurang");
        } else {
            System.out.println("Sisa saldo adalah: " + (saldo - nominalTransaksi));
        }
        return "";
    }

    public boolean validasiPembayaran() {
        return saldo > nominalTransaksi;
    }
}
