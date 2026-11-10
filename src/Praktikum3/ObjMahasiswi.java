package Praktikum3;

public class ObjMahasiswi {
    //OBJECT
    public static void main(String[] args) {
        //mahasiswi 1
        Mahasiswi mhs1 = new Mahasiswi("Zihan", 26, 99.9, 1, "depok");
        //mhs1.tampilData();

        //mahasiswi 2
        Mahasiswi mhs2 = new Mahasiswi("siti", 98, 87, 2, "amrik");
        //mhs2.tampilData();

        //mahasiswi 1
        Mahasiswi mhs3 = new Mahasiswi("Aisyah", 31, 90, 3, "jakarta");
        //mhs3.tampilData();

        //tes class public, private & protected
        System.out.println(mhs1.nama);
        System.out.println(mhs1.umur);
        System.out.println(mhs1.getNilai());
        System.out.println(mhs1.alamat);
    }


}
