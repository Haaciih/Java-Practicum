package Praktikum2;

public class NilaiHimpunan {
    public static void main(String[] args) {
        int[] Nilai = {70, 80, 87, 76, 90, 100};

        System.out.println("jumlah elemen :" + Nilai.length);
        for (int i = 0; i < Nilai.length; i++) ;

        // hitung rata-rata
        int total = 0;
        for (int n : Nilai) {
            total += n;
        }
        double rata = (double) total / Nilai.length;

        System.out.println("rata-rata :" + rata);
    }
}
