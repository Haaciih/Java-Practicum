package praktikum6;

public class KumpulanAset {
    public static void main(String[] args) {
        rumah r1 = new rumah();
        r1.setLantai(3);
        r1.setLuas(3);

        mobil m1 = new mobil();
        m1.setMerk("ferarri");
        m1.setCc(6500);

        Aset[] daftarAset = {r1, m1};

        long totalKekayaan = 0;

        System.out.println("==Daftar Aset Milik Pak ahmad==");

        for (Aset a : daftarAset) {
            System.out.println(a.toString());
            totalKekayaan += a.nilaiAset();
        }

        System.out.println("==============================");
        System.out.println("Total Kekayaan Aset :" + totalKekayaan);
    }
}
