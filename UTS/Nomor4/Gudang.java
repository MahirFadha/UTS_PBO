//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor4;

import java.util.List;
import java.util.ArrayList;

public class Gudang {
    private String lokasiGudang;
    private List<Produk> daftarProduk;

    public Gudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
        this.daftarProduk = new ArrayList<Produk>();
    }

    public String getLokasiGudang() {
        return lokasiGudang;
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public void tambahkanProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}
