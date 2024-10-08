//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor3;

public class Main {
    public static void main(String[] args) {

        TransferBank transferBank = new TransferBank("TRF001", 500000, "1234567890123456");
        transferBank.getNomorTransaksi();
        KartuKredit kk = new KartuKredit("KK001", 500000, "1234567890123456");
        DompetDigital dd = new DompetDigital("DD001", 20000, 500000);
        dd.sisaSaldo();

        System.out.println("Validasi Kartu Kredit: " + kk.validasiPembayaran());
        System.out.println("Validasi Dompet Digital: " + dd.validasiPembayaran());
        System.out.println("Validasi Transfer Bank: " + transferBank.validasiPembayaran());
    }
}
