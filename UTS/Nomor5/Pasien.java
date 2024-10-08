//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor5;

public class Pasien extends Manusia {
    private String nomorRekamMedis;
    private String riwayatPenyakit;

    public Pasien(String nama, int umur, String alamat, String pekerjaan, String nomorRekamMedis,
            String riwayatPenyakit) {
        super(nama, umur, alamat, pekerjaan);
        this.nomorRekamMedis = nomorRekamMedis;
        this.riwayatPenyakit = riwayatPenyakit;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInformasi() {
        super.tampilakanInformasi();
        System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
        System.out.println("Riwayat Penyakit: " + riwayatPenyakit);
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public String getRiwayatPenyakit() {
        return riwayatPenyakit;
    }

    public void setRiwayatPenyakit(String riwayatPenyakit) {
        this.riwayatPenyakit = riwayatPenyakit;
    }
}