package Praktikum7;

public class Matakuliah {
    //
    private String kode, nama;
    private int sks;


    public Matakuliah() {

    }

    //Getter & Setter
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    //TosString()
    @Override
    public String toString() {
        return "Matakuliah{" +
                "kode='" + kode + '\'' +
                ", nama='" + nama + '\'' +
                ", sks=" + sks +
                '}';
    }
}
