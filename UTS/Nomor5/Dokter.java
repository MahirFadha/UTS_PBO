//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor5;

public class Dokter extends Manusia {
    private String spesialisasi;
    private int nomorLisensi;

    public Dokter(String nama, int umur, String alamat, String pekerjaan, String spesialisasi, int nomorLisensi) {
        super(nama, umur, alamat, pekerjaan);
        this.spesialisasi = spesialisasi;
        this.nomorLisensi = nomorLisensi;
    }

    public void tampilakanInformasi() {
        super.tampilakanInformasi();
        System.out.println("Spesialisasi : " + spesialisasi);
        System.out.println("Nomor Lisensi : " + nomorLisensi);
    }

    public String diagnosaPenyakit(Pasien Pasien) {
        return "Diagnosa penyakit " + Pasien.getNama();
    }
}
