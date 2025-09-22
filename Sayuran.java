/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Acer-GK
 */
public class Sayuran {
    private String nama;
    private int berat;
    private String tanggalPanen;
    private String grade;
    private String lokasiLahan;

    public Sayuran(String nama, int berat, String tanggalPanen, String grade, String lokasiLahan) {
        this.nama = nama;
        this.berat = berat;
        this.tanggalPanen = tanggalPanen;
        this.grade = grade;
        this.lokasiLahan = lokasiLahan;
    }

    // Getter & Setter (Encapsulation)
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getBerat() { return berat; }
    public void setBerat(int berat) { this.berat = berat; }

    public String getTanggalPanen() { return tanggalPanen; }
    public void setTanggalPanen(String tanggalPanen) { this.tanggalPanen = tanggalPanen; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getLokasiLahan() { return lokasiLahan; }
    public void setLokasiLahan(String lokasiLahan) { this.lokasiLahan = lokasiLahan; }

    // Method untuk menampilkan detail sayuran
    public String getDetail() {
        return String.format("%-13s | %-9d | %-10s | %-5s | %-15s",
                nama, berat, tanggalPanen, grade, lokasiLahan);
    }
}
