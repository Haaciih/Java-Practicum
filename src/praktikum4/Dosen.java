package praktikum4;

public class Dosen extends person {
    private String nidn;
    private String gelar;

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setGelar(String gelar) {
        this.nidn = gelar;

    }

    @Override
    public String toString() {
        return super.toString() + "\nNIDN :" + nidn + "\nGelar :" + gelar;
    }
}
