package Konversi_Suhu;

import java.util.Scanner;

public class ProgramKonversi {
    public static void main(String[] args) {
        // Buat masing2 Object
        CelciusFarenheit cf = new CelciusFarenheit();
        FarenheitCelicius fc = new FarenheitCelicius();
        CelciusReamur cr = new CelciusReamur();
        ReamurCelcius rc = new ReamurCelcius();

        // Buat scanner
        Scanner scanner = new Scanner(System.in);

        // Tampilkan Pilihan
        System.out.println("=== PROGRAM KONVERSI SUHU ===");
        System.out.println("1. " + cf.satuanInput() + " ke " + cf.satuanOutput());
        System.out.println("2. " + fc.satuanInput() + " ke " + fc.satuanOutput());
        System.out.println("3. " + cr.satuanInput() + " ke " + cr.satuanOutput());
        System.out.println("4. " + rc.satuanInput() + " ke " + rc.satuanOutput());
        System.out.print("Pilih menu (1-4): ");
        int pilihan = scanner.nextInt();

        // Cek pilihan sesuai & tentukan konverter yg dipilih
        KonversiSatuan konverter = null;

        switch (pilihan) {
            case 1:
                konverter = cf;
                break;
            case 2:
                konverter = fc;
                break;
            case 3:
                konverter = cr;
                break;
            case 4:
                konverter = rc;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
        }

        // Input awal
        System.out.print("Masukkan nilai suhu (" + konverter.satuanInput() + "): ");
        float nilaiAwal = scanner.nextFloat();

        // Cetak Hasil
        float hasil = konverter.konversi(nilaiAwal);
        System.out.println("\n--- Hasil Konversi ---");
        System.out.println(nilaiAwal + " " + konverter.satuanInput() + " = " + hasil + " " + konverter.satuanOutput());

        scanner.close();
    }
}