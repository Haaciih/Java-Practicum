package praktikum4;

public class Mahasiswa extends person {
    private String semester;
    private String prodi;

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;

    }

    @Override
    public String toString() {
        return super.toString() + "\nSemester :" + semester + "\nprodi :" + prodi;
    }
}
