package Praktikum7;

import java.util.HashMap;
import java.util.Map;

public class Maptelepon {
    public static void main(String[] args) {
        //Membuat Objek map
        Map<String, String> telp = new HashMap<>();

        //put() = tambah key(nama)
        telp.put("Budi", "08882928");
        telp.put("jaki", "08882978");
        telp.put("bakwan", "08882929");

        //get() =
        System.out.println("no. tlp Budi:" + telp.get("Budi"));

        System.out.println("Daftar telepon Siswa STTNF");

        for (String nama : telp.keySet()) {
            String no = telp.get(nama);
            System.out.println("Siswa" + nama + "no.telpnya" + no);
        }
    }


}
