package praktikum5;

public class KumpulanBentuk {
    public static void main(String[] args) {
        Bentuk2D b1 = new Lingkaran(8);
        Bentuk2D b2 = new Lingkaran(5);
        Bentuk2D p1 = new PersegiPanjang(5);
        Bentuk2D bs1 = new BujurSangkar(3);
        Bentuk2D st1 = new SegiTiga(6, 8);

        Bentuk2D ar_bentuk[] = {b1, b2, p1, bs1, st1};
        for (Bentuk2D b2d : ar_bentuk) {
            System.out.println(b2d + "| luasnya" + b2d.luasbidang());
        }
    }
}
