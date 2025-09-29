package data;

public class Umbi extends Sayuran implements Gradeable {
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

    @Override
    public void tampilkanInfo() {
        System.out.println("Sayuran Umbi => " + getDetail());
    }

    @Override
    public String getGradeInfo() {
        return "Grade umbi ini adalah " + getGrade();
    }
}
