package praktikum5;

public class kucing extends Hewan {

    @Override
    public void bersuara() {
        System.out.println("Meoow");
    }

    @Override
    public String toString() {
        return "suara kucing";
    }
}
