package praktikum5;

public class PersegiPanjang extends Bentuk2D {
    double sisi;

    public PersegiPanjang(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasbidang() {
        return this.sisi * this.sisi;
    }

    @Override
    public double kelilingbidang() {
        return 4.0 * this.sisi;
    }

    @Override
    public String toString() {
        return namaBentuk() + " sisi: " + this.sisi;
    }
}
