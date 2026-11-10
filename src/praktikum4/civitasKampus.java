package praktikum4;

public class civitasKampus {
    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        security s1 = new security();
        Mahasiswa m1 = new Mahasiswa();

        //punya induk
        d1.setNama("Nasrul");
        d1.setGender("Laki lakil");
        s1.setNama("kuncoro");
        s1.setGender("laki-laki");
        m1.setNama("samuel");
        m1.setGender("Another");

        // punya induk
        d1.setNidn("12345");
        d1.setGelar("S1");
        s1.setSektor("Gerbang Belakang");
        s1.setShift("Shift Siang");
        m1.setSemester("semester 14");
        m1.setProdi("ilmu filsafat");


        System.out.println("CIVITAS KAMPUS STTNF");
        System.out.println(d1.toString());
        System.out.println(s1.toString());
        System.out.println(m1.toString());

    }
}
