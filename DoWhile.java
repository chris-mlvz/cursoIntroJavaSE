import java.util.Scanner;

/**
 * DoWhile
 * - Prueba de estructura de control Do While.
 */
public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    sc.close();
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while (response != 0);
        System.out.println("Se terminó el programa");
    }
}