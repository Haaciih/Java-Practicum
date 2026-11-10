package Praktikum2;

public class Arraycampur {
    public static void main(String[] args) {
        Object[][] data = {
                {"Fawwaz", 19, 55.5f},
                {"inaya", 19, 60.5f},
                {"Frida", 19, 45.5f},
        };
        System.out.println("Nama\tUmur\tBeratBadan");
        System.out.println("----------------------");
        for (int i = 0; i < data.length; i++) {
            String nama = (String) data[i][0];
            int umur = (int) data[i][1];
            float berat_badan = (float) data[i][2];
            System.out.println(nama + "\t" + umur + "\t" + berat_badan);
        }
    }
}
