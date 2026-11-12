import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        System.out.println("Examen parcial PRG1.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        int nombre = scanner.nextInt();

        final int MAYORIA_EDAD = 18;
        System.out.println("Introduce tu edad: ");

        int edad = scanner.nextInt();
        edad <= MAYORIA_EDAD ? System.out.println("Eres menor de edad") : System.out.println("Eres mayor de edad");
        if (17 >= edad && edad >= 70){
            System.out.println("Introduce otra edad: ");
            edad = scanner.nextInt();
        }

        System.out.println("Introduce el numero de asignaturas en la que esta matriculado: ");
        int asignaturas = scanner.nextInt();

        if (asignaturas < 1 && asignaturas > 10) {
            System.out.println("Introduce un numero de asignaturas valido: ");
            asignaturas = scanner.nextInt();

        }
        System.out.println("Dime tu nota en cada asignatura, el texto tiene que leer, 'Nota de la asignatura N: '");

        double notaMedia = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / asignaturas;

        scanner.close();    
    }
}
