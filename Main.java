package main;

import data.*;
import manager.PanenManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PanenManager pm = new PanenManager();
        boolean aktif = true;

        while (aktif) {
            System.out.println("\n=== SISTEM PENCATATAN HASIL PANEN ===");
            System.out.println("1. Tambah Sayuran");
            System.out.println("2. Lihat Semua Sayuran");
            System.out.println("3. Update Sayuran");
            System.out.println("4. Hapus Sayuran");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama komoditas: ");
                    String nama = scanner.nextLine();
                    System.out.print("Berat (kg): ");
                    int berat = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tanggal panen (dd-mm-yyyy): ");
                    String tanggal = scanner.nextLine();
                    System.out.print("Grade (A/B/C): ");
                    String grade = scanner.nextLine();
                    System.out.print("Lokasi lahan: ");
                    String lokasi = scanner.nextLine();
                    System.out.print("Jenis sayuran (1=Umbi, 2=Daun): ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    if (jenis == 1) {
                        System.out.print("Masukkan jenis umbi (contoh: wortel, kentang): ");
                        String jenisUmbi = scanner.nextLine();
                        pm.tambahHasil(new Umbi(nama, berat, tanggal, grade, lokasi, jenisUmbi));
                    } else {
                        System.out.print("Masukkan warna daun (contoh: hijau tua, hijau muda): ");
                        String warnaDaun = scanner.nextLine();
                        pm.tambahHasil(new Daun(nama, berat, tanggal, grade, lokasi, warnaDaun));
                    }
                }

                case 2 -> pm.tampilkanHasil();

                case 3 -> {
                    pm.tampilkanHasil();
                    System.out.print("Nomor data yang ingin diupdate: ");
                    int idx = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Nama komoditas baru: ");
                    String nama = scanner.nextLine();
                    System.out.print("Berat baru (kg): ");
                    int berat = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tanggal baru (dd-mm-yyyy): ");
                    String tanggal = scanner.nextLine();
                    System.out.print("Grade baru (A/B/C): ");
                    String grade = scanner.nextLine();
                    System.out.print("Lokasi baru: ");
                    String lokasi = scanner.nextLine();
                    System.out.print("Jenis sayuran (1=Umbi, 2=Daun): ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    boolean hasil;
                    if (jenis == 1) {
                        System.out.print("Masukkan jenis umbi baru: ");
                        String jenisUmbi = scanner.nextLine();
                        hasil = pm.updateHasil(idx, new Umbi(nama, berat, tanggal, grade, lokasi, jenisUmbi));
                    } else {
                        System.out.print("Masukkan warna daun baru: ");
                        String warnaDaun = scanner.nextLine();
                        hasil = pm.updateHasil(idx, new Daun(nama, berat, tanggal, grade, lokasi, warnaDaun));
                    }

                    if (hasil) System.out.println(">>> Data berhasil diupdate!");
                    else System.out.println("Nomor tidak valid!");
                }

                case 4 -> {
                    pm.tampilkanHasil();
                    System.out.print("Nomor data yang ingin dihapus: ");
                    int idx = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (pm.hapusHasil(idx)) System.out.println(">>> Data berhasil dihapus!");
                    else System.out.println("Nomor tidak valid!");
                }

                case 5 -> {
                    aktif = false;
                    System.out.println("Program selesai. Terima kasih!");
                }

                default -> System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
