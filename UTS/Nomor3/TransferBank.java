//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor3;

public class TransferBank extends Transasksi implements Pembayaran {
    String nomorRekening;

    public TransferBank(String nomorTransaksi, int nominalTransaksi, String nomorRekening) {
        super(nomorTransaksi, nominalTransaksi);
        this.nomorRekening = nomorRekening;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public boolean validasiPembayaran() {
        return nomorRekening.matches("[0-9]{12}");
    }
}
