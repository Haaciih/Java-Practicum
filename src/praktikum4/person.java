package praktikum4;

public class person {

    private String nama;
    private String gender;

    //fungsi
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nnama :" + nama + "\nGender :" + gender;
    }
}
