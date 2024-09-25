import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número positivo: ");
        int numero = sc.nextInt();


        if (numero <= 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {

            int potenciaMasProxima = 1;


            while (potenciaMasProxima * 2 <= numero) {
                potenciaMasProxima *= 2;
            }

            System.out.println("La potencia de 2 más próxima y menor a " + numero + " es: " + potenciaMasProxima);
        }

        sc.close();
    }
}
