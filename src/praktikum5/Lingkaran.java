package praktikum5;

public class Lingkaran extends Bentuk2D {
    public static final double phi = 3.14;

    double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double luasbidang() {
        return phi * this.jari2 * this.jari2;
    }

    @Override
    public double kelilingbidang() {
        return 2.0 * phi * this.jari2;
    }

    @Override
    public String toString() {
        return namaBentuk() + "jari-jari" + this.jari2;
    }
}
