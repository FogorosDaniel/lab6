public class Main {
    public static void main(String[] args) {
      AdvancedCalc c = new AdvancedCalc();

      c.Adunare(7);
      c.Scadere(2);
      c.Inmultire(5);

      System.out.println(c.getRezultat());
    }
}