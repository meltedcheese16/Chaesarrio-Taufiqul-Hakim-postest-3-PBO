/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer-GK
 */
package manager;
import data.Sayuran;
import java.util.ArrayList;

public class PanenManager {
    private ArrayList<Sayuran> daftarHasil;

    public PanenManager() {
        daftarHasil = new ArrayList<>();
    }

    public void tambahHasil(Sayuran s) {
        daftarHasil.add(s);
        System.out.println(">>> Komoditas berhasil ditambahkan!");
    }

    public void tampilkanHasil() {
        System.out.println("\n================== DAFTAR HASIL PANEN ==================");
        if (daftarHasil.isEmpty()) {
            System.out.println("|             Belum ada data panen yang tersimpan!     |");
            return;
        }
        System.out.printf("| %-3s | %-13s | %-9s | %-10s | %-5s | %-15s | Info Tambahan\n",
                "No", "Komoditas", "Berat(kg)", "Tanggal", "Grade", "Lokasi Lahan");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < daftarHasil.size(); i++) {
            System.out.printf("| %-3d | %s\n", i + 1, daftarHasil.get(i).getDetail());
        }
    }

    public boolean updateHasil(int index, Sayuran baru) {
        if (index < 0 || index >= daftarHasil.size()) return false;
        daftarHasil.set(index, baru);
        return true;
    }

    public boolean hapusHasil(int index) {
        if (index < 0 || index >= daftarHasil.size()) return false;
        daftarHasil.remove(index);
        return true;
    }
}
