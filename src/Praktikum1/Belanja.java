package Praktikum1;

public class Belanja {
    public static void main(String[] args) {
        //Deklarasi dan inisialisasi
        String pelanggan = "casmin";
        double totalBelanja = 150000;
        String keterangan;

        //Struktur Kendali if-else
        //Jika total belanja > 10000 maka pelanggan dapat hadiah
        if (totalBelanja > 100000) {
            keterangan = "selamat anda mendapat hadiah";
        } else {
            keterangan = "Terima kasih sudah berbelanja";
        }
        //menampilkan nama pelanggan, total belanja dan keterangan
        System.out.print("Nama Pelanggan: " + pelanggan);
        System.out.print("\nTotal Belanja: " + totalBelanja);
        System.out.print("\nketerangan: " + keterangan);
    }
}
