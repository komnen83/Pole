package tech.kuba.sda.figura;

import tech.kuba.sda.figura.Figura;

public class Prostokat implements Figura {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double obliczPowierzchnie() {
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
