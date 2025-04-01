public class Calculator {
    protected double rezultat;
    public Calculator() {
        rezultat = 0;
    }
    public Calculator(double x) {
        rezultat = x;
    }

    public Calculator Adunare(double x) {
        rezultat += x;
        return this;
    }

    public Calculator Scadere(double x) {
        rezultat -= x;
        return this;
    }

    public Calculator Inmultire(double x) {
        rezultat *= x;
        return this;
    }

    public Calculator Impartire(double x) {
       if (rezultat == 0) {
           throw new RuntimeException("Nu merge cu 0");
       }
       rezultat /= x;
       return this;
    }

    public double getRezultat() {
        return rezultat;
    }
}
