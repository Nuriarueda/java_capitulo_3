import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println ("Introduzca el primer numero del que quieres realizar la multiplicacion: ");
        double numero1 = s.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        double numero2 = s.nextDouble();
        double total = ( numero1*numero2);
        System.out.println("La multiplicacion da: " + total); 
        s.close();
      
    }
}
