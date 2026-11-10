package Praktikum1;

public class Nilai {
    public static void main(String[] args) {
        float nilai = 90.70f;    // ubah nilai
        String nama = "ali";
        //operator ternary
        //jika nilai >=60 maka LULUS
        // Jika nilai <=60 maka GAGAL
        String keterangan = (nilai >= 60) ? "LULUS" : "GAGAL";

        //if multi kondisi -> AND disebut &&
        //jika nilai >=85 dan <=100 maka Grade A
        //jika nilai >=75 dan <=85 maka Grade B
        //jika nilai >=60 dan <=75 maka Grade C
        //jika nilai >=30 dan <=60 maka Grade D
        //selain itu Grade E
        char grade;
        if (nilai >= 85 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 75 && nilai <= 85) {
            grade = 'B';
        } else if (nilai >= 60 && nilai <= 75) {
            grade = 'C';
        } else if (nilai >= 30 && nilai <= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        //Switch Case
        String predikat;
        switch (grade) {
            case 'A':
                predikat = "Memuaskan";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "cukup";
                break;
            case 'D':
                predikat = "Jelek";
            default:
                predikat = "";

        }
        //menampilkan Nilai keterangan grade dan predikat
        System.out.print("Nama: " + nama);
        System.out.print("\nNilai: " + nilai);
        System.out.print("\nNilai: " + keterangan);
        System.out.print("\nNilai: " + grade);
        System.out.print("\nNilai: " + predikat);
    }
}
