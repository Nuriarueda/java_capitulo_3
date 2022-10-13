import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Introduzca el radio del cono: ");
      Double radio = s.nextDouble();
      System.out.println("Introduzca la altura del cono: ");
      Double altura = s.nextDouble();
      Double volumen = ( 1.0/3.0 )* Math.PI * Math.pow(radio, 2) * (altura);
      System.out.println("El volumen del cono es: " + volumen);      
      s.close();
      
      
    }
}
