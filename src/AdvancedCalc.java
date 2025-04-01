public class AdvancedCalc extends Calculator {
    public AdvancedCalc() {
        super();
    }
    public AdvancedCalc(double x) {
        super(x);
    }

    public void Radical( ) {
        if(rezultat<0){
            throw new RuntimeException("eroare");
        }
        rezultat = Math.sqrt(rezultat);

    }
}
