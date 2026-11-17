package Praktikum8;

public class ExceptionPembagian {
    public static void main(String[] args) {
        try {
            int angka = 20;
            int hasil = angka / 0;

            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa membagi dengan Nol!");
        }

        try {
            int[] detailNilai = new int[5];
            detailNilai[7] = 100;
            System.out.println("Isi Array berhasil di masukan!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Memori array tidak sesuai!");

            System.out.println("Pesan Sistem: " + e.getMessage());
        } finally {
            System.out.println("semua blok tercetak");
        }
    }
}
