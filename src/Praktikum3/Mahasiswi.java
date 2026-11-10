package Praktikum3;

public class Mahasiswi {

    //member 1
    //variable /atribut / data mahasiswi
    //public: bisa diakses dari class lain
    //protected: bisa diakses dalam package
    //private: hanya bisa diakses di dalam class mahasiswi
    public String nama;
    protected int umur;
    private double nilai;
    public int nim;
    public String alamat;

    //member 2 - constructor
    public Mahasiswi(String nama, int umur, double nilai, int nim, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.nilai = nilai;
        this.nim = nim;
        this.alamat = alamat;
    }

    //method  (function calam class) untuk mencetak data mahasiswi
    public void tampilData() {
        System.out.println("Nama :" + nama);
        System.out.println("Umur :" + umur);
        System.out.println("Nilai :" + nilai);
        System.out.println("Nim :" + nim);
        System.out.println("Alamat :" + alamat);
        System.out.println();//jarak Enter
    }

    public double getNilai() {
        return nilai;
    }
}
