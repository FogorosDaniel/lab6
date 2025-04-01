public class AdvancedCalc extends Calculator {
    public AdvancedCalc() {
        super();
    }
    public AdvancedCalc(double x) {
        super(x);
    }

    public void Radical(double x) {
        if(x<0){
            throw new RuntimeException("eroare");
        }
        rezultat = Math.sqrt(rezultat);

    }
}
