package tech.kuba.sda.figura;

import tech.kuba.sda.figura.Figura;

public class Kolo implements Figura {
    private int promien;

    public Kolo(int promien) {
        this.promien = promien;
    }

    public double obliczPowierzchnie() {
        return Math.PI * (promien * promien);
    }

    @Override
    public String toString() {
        return "Kolko{" +
                ", promien=" + promien +
                '}';
    }
}
