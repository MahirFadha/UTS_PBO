//Author : M. Sulthan Mahir Fadha (09020623035)
package UTS.Nomor5;

public class Main {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr.Andi", 30, "Jl. Amir Mahmud", "Dokter", "Dokter Gigi", 12345);
        dokter1.tampilakanInformasi();
        System.out.println();

        Pasien pasien1 = new Pasien("Ahmad", 25, "Jl. Jendral Sudirman", "Mahasiswa", "12345", "Penyakit Gigi");
        Pasien pasien2 = new Pasien("Budi", 20, "Jl. Pangeran Tirtayasa", "Mahasiswa", "23456", "Penyakit Jantung");
        pasien1.tampilakanInformasi();
        System.out.println();

        Ruangan ruangan1 = new Ruangan(1, 2);
        try {
            ruangan1.tambahPasien(pasien1);
            ruangan1.tambahPasien(pasien2);
            ruangan1.tampilkanInformasi();
        } catch (RuanganPenuhException e) {
            System.out.println(e.getMessage());
        }
    }
}
