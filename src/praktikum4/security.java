package praktikum4;

public class security extends person {
    private String shift;
    private String sektor;

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;

    }

    @Override
    public String toString() {
        return super.toString() + "\nShift :" + shift + "\nSektor :" + sektor;
    }
}

