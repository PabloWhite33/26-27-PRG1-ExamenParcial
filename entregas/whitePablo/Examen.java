import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        System.out.println("Examen parcial PRG1.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        int nombre = scanner.nextInt();
        final int MAYORIA_EDAD = 18;
        int edad = scanner.nextInt();
        edad <= MAYORIA_EDAD ? System.out.println("Eres menor de edad") : System.out.println("Eres mayor de edad");

        scanner.close();    
    }
}
