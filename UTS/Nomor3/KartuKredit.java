//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor3;

public class KartuKredit extends Transasksi implements Pembayaran {
    protected String nomorKartu;

    public KartuKredit(String nomorTransaksi, int nominalTransaksi, String nomorKartu) {
        super(nomorTransaksi, nominalTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public boolean validasiPembayaran() {
        return nomorKartu.matches("[0-9]{16}");
    }
}
