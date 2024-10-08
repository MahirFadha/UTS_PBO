//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor4;

import java.util.ArrayList;
import java.util.List;

public class Kategori {
    public String namaKategori;
    public List<Produk> daftarProduk;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarProduk = new ArrayList<>();
    }

    public String getNama() {
        return namaKategori;
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        produk.tambahkanKategori(this);
    }
}
