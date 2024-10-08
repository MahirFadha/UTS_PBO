//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor5;

import java.util.List;
import java.util.ArrayList;

public class Ruangan {
    private int nomorRuangan;
    private int kapasitas;
    private List<Pasien> daftarPasien;

    public Ruangan(int nomorRuangan, int kapasitas) {
        this.nomorRuangan = nomorRuangan;
        this.kapasitas = kapasitas;
        this.daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(Pasien pasien) throws RuanganPenuhException {
        if (daftarPasien.size() >= kapasitas) {
            throw new RuanganPenuhException("Ruangan Penuh");
        } else {
            daftarPasien.add(pasien);
        }
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void tampilkanInformasi() {
        System.out.println("Nomor Ruangan: " + nomorRuangan);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Jumlah Pasien: " + daftarPasien.size());
    }

}
