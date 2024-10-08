//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor3;

public abstract class Transasksi {
    protected String nomorTransaksi;
    protected int nominalTransaksi;

    public Transasksi(String nomorTransaksi, int nominalTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
        this.nominalTransaksi = nominalTransaksi;
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }

    public double getNominalTransaksi() {
        return nominalTransaksi;
    }

    public abstract boolean validasiPembayaran();
}
