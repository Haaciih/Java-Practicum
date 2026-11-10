package praktikum5;

public abstract class Bentuk2D {
    public String namaBentuk() {
        return getClass().getSimpleName();
    }

    public abstract double luasbidang();

    public abstract double kelilingbidang();
}

