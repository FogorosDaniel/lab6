public class Main {
    public static void main(String[] args) {
      Calculator c = new Calculator();

      c.Adunare(7);
      c.Scadere(2);
      c.Inmultire(5);

      System.out.println(c.getRezultat());
    }
}