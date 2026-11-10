package praktikum5;

public class SegiTiga extends Bentuk2D {
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    // Constructor untuk keliling & luas lengkap
    public SegiTiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Constructor sederhana (jika diasumsikan segitiga sama sisi: sisi1 = sisi2 = sisi3 = alas)
    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = alas;
        this.sisi2 = alas;
        this.sisi3 = alas;
    }

    @Override
    public double luasbidang() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double kelilingbidang() {
        return this.sisi1 + this.sisi2 + this.sisi3;
    }

    @Override
    public String toString() {
        return namaBentuk() + " alas: " + this.alas + ", tinggi: " + this.tinggi;
    }
}
