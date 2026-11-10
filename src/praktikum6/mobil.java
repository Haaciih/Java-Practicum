package praktikum6;

public class mobil implements Aset {
    private String merk;
    private int cc;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public long nilaiAset() {
        return 2000000;
    }

    public String toString() {
        return "Mobil merk :" + merk + "Mesin : " + cc + "CC" + "// Nilai : Rp" + nilaiAset();
    }
}
