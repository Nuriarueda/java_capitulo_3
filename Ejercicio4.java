import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Introduzca el primer numero: ");
      Double numero1 = s.nextDouble();
      System.out.println("Introduzca el segundo numero: ");
      Double numero2 = s.nextDouble();
      Double suma = ( numero1 + numero2);
      System.out.println("El resultado de la suma es: " + suma);
      Double resta = ( numero1 - numero2);
      System.out.println("El resultado de la resta es: " + resta);
      Double multiplicacion = ( numero1 * numero2);
      System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
      Double division = ( numero1 / numero2);
      System.out.println("El resultado de la division es: " + division);
      s.close();
      
    }
}

