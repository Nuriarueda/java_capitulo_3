import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuantos Mb quieres convertir a Kb?: ");
        int Mb = s.nextInt();
        int Kb = ( Mb * 1000 );
        System.out.println( Mb + " Mb son: " + Kb + " Kb");
        s.close();
      
    }
}
