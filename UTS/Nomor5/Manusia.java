//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor5;

public class Manusia {
    protected String nama;
    private int umur;
    private String alamat;
    private String pekerjaan;

    public Manusia(String nama, int umur, String alamat, String pekerjaan) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
    }

    public void tampilakanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
