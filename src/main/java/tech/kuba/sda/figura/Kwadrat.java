package tech.kuba.sda.figura;

import tech.kuba.sda.figura.Figura;

public class Kwadrat implements Figura {
   private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    public double obliczPowierzchnie() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }
}
