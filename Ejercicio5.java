import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Introduzca la base del rectangulo");
      Double base = s.nextDouble();
      System.out.println("Introduzca la altura del rectangulo");
      Double altura = s.nextDouble();
      Double area = (base*altura);
      System.out.println("El area del rectangulo es: " + area);
      s.close();
        }
}
