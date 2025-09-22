/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Acer-GK
 */
public class Daun extends Sayuran {
    private String warnaDaun;

    public Daun(String nama, int berat, String tanggalPanen, String grade, String lokasiLahan, String warnaDaun) {
        super(nama, berat, tanggalPanen, grade, lokasiLahan);
        this.warnaDaun = warnaDaun;
    }

    public String getWarnaDaun() { return warnaDaun; }
    public void setWarnaDaun(String warnaDaun) { this.warnaDaun = warnaDaun; }

    // Overriding
    @Override
    public String getDetail() {
        return super.getDetail() + String.format(" | Warna: %-10s", warnaDaun);
    }
}

