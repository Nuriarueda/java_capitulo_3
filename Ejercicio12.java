import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        Double nota1 = s.nextDouble();
        System.out.print("¿Que nota quieres sacar en el trimestre?: ");
        Double nota2 = s.nextDouble ();
        Double nota3 = (( nota2 * 100 ) - ( nota1 * 40)) / 60;
        System.out.print ("Para sacar un " + nota2 + " en el trimmestre, tienes que sacar en el siguiente examen un: " + nota3);

        s.close();
      
    }
}
