public class Calculator {
    protected double rezultat;
    public Calculator() {
        rezultat = 0;
    }
    public Calculator(double x) {
        rezultat = x;
    }

    public void Adunare(double x) {
        rezultat += x;
    }

    public void Scadere(double x) {
        rezultat -= x;
    }

    public void Inmultire(double x) {
        rezultat *= x;
    }

    public void Impartire(double x) {
       if (rezultat == 0) {
           throw new RuntimeException("Nu merge cu 0");
       }
       rezultat /= x;
    }

    public double getRezultat() {
        return rezultat;
    }
}
