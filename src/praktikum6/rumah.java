package praktikum6;

public class rumah implements Aset {
    private int lantai;
    private int luas;

    public void setLantai(int lantai) {
        this.lantai = lantai;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    @Override
    public long nilaiAset() {
        return 3000000;
    }

    public String toString() {
        return "Rumah Lantai" + lantai + "(luas : " + luas + "m2)" + "Nilai : Rp" + nilaiAset();
    }
}
