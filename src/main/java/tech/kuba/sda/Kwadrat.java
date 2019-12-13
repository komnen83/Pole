package tech.kuba.sda;

public class Kwadrat {
   private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    double obliczPowierzchnie() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }
}
