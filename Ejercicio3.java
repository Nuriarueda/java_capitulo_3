import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Introduce las pesetas que quieres pasar a euros: ");
      double pesetas = s.nextDouble();
      double euros = ( 0.0060 * pesetas);
      System.out.println("Son: " + euros + "euros");
      s.close();
    }
}
