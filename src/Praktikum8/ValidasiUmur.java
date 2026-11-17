package Praktikum8;

import java.util.Scanner;

public class ValidasiUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("validasi Umur");
        System.out.println("Masukan Umur kalian (harus angka) : ");

        String inputUser = scanner.nextLine();

        try {
            int usia = Integer.parseInt(inputUser);

            System.out.println("Usia Kamu Sekarang adalah : " + usia + " Tahun");
            System.out.println("Usia Kamu 5 Tahun Kedepan : " + (usia + 5) + " Tahun");
        } catch (NumberFormatException e) {
            System.out.println("Angka tidak valid");
            System.out.println("Error sistem : " + e.getMessage());
        } finally {
            System.out.println("program selesai");
            scanner.close();
        }
    }


}
