package data;

public class Daun extends Sayuran implements Gradeable {
    private String warnaDaun;

    public Daun(String nama, int berat, String tanggalPanen, String grade, String lokasiLahan, String warnaDaun) {
        super(nama, berat, tanggalPanen, grade, lokasiLahan);
        this.warnaDaun = warnaDaun;
    }

    public String getWarnaDaun() { return warnaDaun; }
    public void setWarnaDaun(String warnaDaun) { this.warnaDaun = warnaDaun; }

    @Override
    public String getDetail() {
        return super.getDetail() + String.format(" | Warna: %-10s", warnaDaun);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Sayuran Daun => " + getDetail());
    }

    @Override
    public String getGradeInfo() {
        return "Grade daun ini adalah " + getGrade();
    }
}
