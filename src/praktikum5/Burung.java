package praktikum5;

public class Burung extends Hewan {

    @Override
    public void bersuara() {
        System.out.println("ciutttt");
    }

    @Override
    public String toString() {
        return "suara Burung";
    }
}
