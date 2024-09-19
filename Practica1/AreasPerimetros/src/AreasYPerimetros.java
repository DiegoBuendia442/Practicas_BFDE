import java.util.Scanner;

public class AreasYPerimetros {


    public static double metrosACentimetros(double valorEnMetros) {
        return valorEnMetros * 100;
    }


    public static double[] areaPerimetroCuadrado(double lado) {
        double area = lado * lado;
        double perimetro = 4 * lado;
        return new double[]{area, perimetro};
    }


    public static double[] areaPerimetroRectangulo(double largo, double ancho) {
        double area = largo * ancho;
        double perimetro = 2 * (largo + ancho);
        return new double[]{area, perimetro};
    }


    public static double[] areaPerimetroCirculo(double radio) {
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        return new double[]{area, perimetro};
    }


    public static double[] areaPerimetroTriangulo(double base, double altura, double lado1, double lado2) {
        double area = 0.5 * base * altura;
        double perimetro = base + lado1 + lado2;
        return new double[]{area, perimetro};
    }

    public static double[] areaPerimetroPentagono(double lado, double apotema) {
        double area = 0.5 * 5 * lado * apotema;
        double perimetro = 5 * lado;
        return new double[]{area, perimetro};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el lado del cuadrado en metros: ");
        double ladoCuadrado = scanner.nextDouble();

        System.out.print("Ingresa el largo del rectángulo en metros: ");
        double largoRectangulo = scanner.nextDouble();

        System.out.print("Ingresa el ancho del rectángulo en metros: ");
        double anchoRectangulo = scanner.nextDouble();

        System.out.print("Ingresa el radio del círculo en metros: ");
        double radioCirculo = scanner.nextDouble();

        System.out.print("Ingresa la base del triángulo en metros: ");
        double baseTriangulo = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo en metros: ");
        double alturaTriangulo = scanner.nextDouble();

        System.out.print("Ingresa el primer lado del triángulo en metros: ");
        double lado1Triangulo = scanner.nextDouble();

        System.out.print("Ingresa el segundo lado del triángulo en metros: ");
        double lado2Triangulo = scanner.nextDouble();

        System.out.print("Ingresa el lado del pentágono en metros: ");
        double ladoPentagono = scanner.nextDouble();

        System.out.print("Ingresa el apotema del pentágono en metros: ");
        double apotemaPentagono = scanner.nextDouble();


        double[] cuadrado = areaPerimetroCuadrado(ladoCuadrado);
        System.out.printf("\nCuadrado:\nÁrea: %.2f m² | %.2f cm²\nPerímetro: %.2f m | %.2f cm\n",
                cuadrado[0], metrosACentimetros(cuadrado[0]), cuadrado[1], metrosACentimetros(cuadrado[1]));


        double[] rectangulo = areaPerimetroRectangulo(largoRectangulo, anchoRectangulo);
        System.out.printf("\nRectángulo:\nÁrea: %.2f m² | %.2f cm²\nPerímetro: %.2f m | %.2f cm\n",
                rectangulo[0], metrosACentimetros(rectangulo[0]), rectangulo[1], metrosACentimetros(rectangulo[1]));


        double[] circulo = areaPerimetroCirculo(radioCirculo);
        System.out.printf("\nCírculo:\nÁrea: %.2f m² | %.2f cm²\nPerímetro: %.2f m | %.2f cm\n",
                circulo[0], metrosACentimetros(circulo[0]), circulo[1], metrosACentimetros(circulo[1]));


        double[] triangulo = areaPerimetroTriangulo(baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo);
        System.out.printf("\nTriángulo:\nÁrea: %.2f m² | %.2f cm²\nPerímetro: %.2f m | %.2f cm\n",
                triangulo[0], metrosACentimetros(triangulo[0]), triangulo[1], metrosACentimetros(triangulo[1]));


        double[] pentagono = areaPerimetroPentagono(ladoPentagono, apotemaPentagono);
        System.out.printf("\nPentágono:\nÁrea: %.2f m² | %.2f cm²\nPerímetro: %.2f m | %.2f cm\n",
                pentagono[0], metrosACentimetros(pentagono[0]), pentagono[1], metrosACentimetros(pentagono[1]));

        scanner.close();
    }
}
