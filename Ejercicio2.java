import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Introduces los euros que quieres pasar a pesetas: ");
      double euros = s.nextDouble();
      double pesetas = ( 166.3860 * euros);
      System.out.println("Son: " + pesetas + "pesetas");  
      s.close();
    }
}
