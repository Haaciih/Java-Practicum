package Praktikum7;

import java.util.ArrayList;
import java.util.List;

public class ListMatakuliah {
    public static void main(String[] args) {

        //membuat objek arraylist
        List<Matakuliah> mk = new ArrayList<>();

        //membuat 3 objek
        Matakuliah m1 = new Matakuliah();
        Matakuliah m2 = new Matakuliah();
        Matakuliah m3 = new Matakuliah();

        m1.setKode("001");
        m1.setNama("Bahasa Indonesia");
        m1.setSks(2);

        m2.setKode("002");
        m2.setNama("Bahasa Inggris");
        m2.setSks(2);

        m3.setKode("003");
        m3.setNama("Matematika");
        m3.setSks(2);

        mk.add(m1);
        mk.add(m2);
        mk.add(m3);

        for (int i = 0; i < mk.size(); i++) {
            System.out.println(mk.get(i));
        }

        System.out.println("jumlah matkul:" + mk.size());
    }

}
