import java.util.Scanner;

public class Plano2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce la coordenada X: ");
        double x = sc.nextDouble();

        System.out.print("Introduce la coordenada Y: ");
        double y = sc.nextDouble();


        if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el Cuadrante I.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el Cuadrante II.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el Cuadrante III.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el Cuadrante IV.");
        } else if (x == 0 && y != 0) {
            System.out.println("El punto (" + x + ", " + y + ") está sobre el eje Y.");
        } else if (x != 0 && y == 0) {
            System.out.println("El punto (" + x + ", " + y + ") está sobre el eje X.");
        } else {
            System.out.println("El punto (" + x + ", " + y + ") está en el origen.");
        }


        sc.close();
    }
}
