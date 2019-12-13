package tech.kuba.sda;

public class Kolo {
    private int promien;

    public Kolo(int promien) {
        this.promien = promien;
    }

    public int getPromien() {
        return promien;
    }


    double obliczPowierzchnie() {
        return Math.PI * (promien * promien);
    }

    @Override
    public String toString() {
        return "Kolko{" +
                ", promien=" + promien +
                '}';
    }
}
