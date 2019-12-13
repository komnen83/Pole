package tech.kuba.sda;

public class Prostokat {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    double obliczPowierzchnie() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }


}
