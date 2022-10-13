import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Introduce tu sueldo: ");
      double sueldo = s.nextDouble();
      double sueldo2 = (sueldo/1.21);
      System.out.println("Tu sueldo final sera: " + sueldo2);
      s.close();

    }
}
