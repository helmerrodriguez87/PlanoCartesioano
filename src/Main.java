import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        PlanoUbicacion mostrar = new PlanoUbicacion();
        boolean salir = false;
        int opcion;

        while (salir) {

            System.out.println("1. Arriba");
            System.out.println("2. Abajo");
            System.out.println("3. Derecha");
            System.out.println("4. Izquierda");

            try {

                System.out.println("Digite una opcion: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("mover hacia arriba");
                        break;
                    case 2:
                        System.out.println("mover hacia abajo");
                        break;
                    case 3:
                        System.out.println("Mover hacia la derecha");
                        break;
                    case 4:
                        System.out.println("Mover hacia la izquierda:");
                        break;
                    case 5:
                        salir = true;
                    default:
                        System.out.println("Seleccion valida entre 1 y 5");
                }

            } catch (InputMismatchException e) {
                System.out.println("OPCION NO VALIDA");
                entrada.next();

            }
        }
    }
}