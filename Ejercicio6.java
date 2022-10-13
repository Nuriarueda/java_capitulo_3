import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Introduzca la base del triangulo");
      Double base = s.nextDouble();
      System.out.println("Introduzca la altura del triangulo");
      Double altura = s.nextDouble();
      Double area = (base*altura)/2;
      System.out.println("El area del triangulo es: " + area);
      s.close();
        }
}
