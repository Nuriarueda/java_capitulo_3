import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Introduzca las horas que trabjas al dia: ");
      int horas = s.nextInt();
      int sueldo1 = ( 12 * horas );
      int sueldo2 = ( sueldo1 * 7 );
      System.out.println("Tu sueldo semanal es de: " + sueldo2 + " euros");
      s.close();

      
      
    }
}
