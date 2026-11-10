package praktikum5;

public class kumpulanSuaraHewan {
    public static void main(String[] args) {
        //buat object
        Hewan kucing = new kucing();
        Hewan Burung = new Burung();

        //panggil method bersuara
        kucing.bersuara();
        Burung.bersuara();

    }
}
