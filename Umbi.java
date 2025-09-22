/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Acer-GK
 */
public class Umbi extends Sayuran {
    private String jenisUmbi;

    public Umbi(String nama, int berat, String tanggalPanen, String grade, String lokasiLahan, String jenisUmbi) {
        super(nama, berat, tanggalPanen, grade, lokasiLahan);
        this.jenisUmbi = jenisUmbi;
    }

    public String getJenisUmbi() { return jenisUmbi; }
    public void setJenisUmbi(String jenisUmbi) { this.jenisUmbi = jenisUmbi; }

    // Overriding
    @Override
    public String getDetail() {
        return super.getDetail() + String.format(" | Jenis: %-10s", jenisUmbi);
    }
}

