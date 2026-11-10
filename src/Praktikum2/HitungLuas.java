package Praktikum2;

import javax.swing.JOptionPane;

public class HitungLuas {

    // Method hitung luas lingkaran
    public static float luasLingkaran(int r) {
        return (float) (22.0 / 7.0) * r * r;
    }

    // Method hitung luas segitiga
    public static float luasSegitiga(float alas, float tinggi) {
        return 0.5f * alas * tinggi;
    }

    public static void main(String[] args) {
        // Input data
        int jariJari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran: "));
        float alas = Float.parseFloat(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
        float tinggi = Float.parseFloat(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));

        // Hitung luas
        float hasilLuasLingkaran = luasLingkaran(jariJari);
        float hasilLuasSegitiga = luasSegitiga(alas, tinggi);

        // Susun pesan output
        String pesan = "Luas Lingkaran dengan jari-jari " + jariJari + " = " + hasilLuasLingkaran + "\n" +
                "Luas Segitiga dengan alas " + alas + " dan tinggi " + tinggi + " = " + hasilLuasSegitiga;

        // Tampilkan hasil ke popup dialog
        JOptionPane.showMessageDialog(null, pesan);
    }
}
