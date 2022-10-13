import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuantos Kb quieres convertir a Mb?: ");
        Double Kb = s.nextDouble();
        Double Mb = ( Kb / 1000 );
        System.out.println( Kb + " Kb son: " + Mb + " Mb");
        s.close();
      
    }
}
