//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor4;

public class Main {

    public static void main(String[] args) {
        // membuat objek kategori
        Produk produk1 = new Produk("Nasi Goreng", 15000, 10);
        Produk produk2 = new Produk("Ayam Goreng", 25000, 5);
        Produk produk3 = new Produk("Es Jeruk", 10000, 20);
        Produk produk4 = new Produk("Es Krim", 8000, 15);

        Kategori Makanan = new Kategori("Makanan");
        Kategori Minuman = new Kategori("Minuman");
        Kategori Cemilan = new Kategori("Cemilan");

        Makanan.tambahProduk(produk1);
        Makanan.tambahProduk(produk2);
        Minuman.tambahProduk(produk3);
        Cemilan.tambahProduk(produk4);

        Gudang gudangLamongan = new Gudang("Lamongan");
        Gudang gudangJombang = new Gudang("Jombang");

        gudangJombang.tambahkanProduk(produk4);
        gudangLamongan.tambahkanProduk(produk1);
        gudangLamongan.tambahkanProduk(produk2);
        gudangLamongan.tambahkanProduk(produk3);

        System.out.println("Produk dalam gudang Jombang: ");
        for (Produk produk : gudangJombang.getDaftarProduk()) {
            System.out.println(" - " + produk.getNamaProduk());
        }
        System.out.println("Produk dalam gudang Lamongan: ");
        for (Produk produk : gudangLamongan.getDaftarProduk()) {
            System.out.println(" - " + produk.getNamaProduk());
        }
    }
}
