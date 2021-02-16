import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);

        final double pi = 3.14159;

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double areaTriangulo =  (a * c) / 2;
        double areaCirculo = pi * (c * c);
        double areaTrapezio = ((a + b) / 2) * c;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
    
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo); 
        System.out.printf("CIRCULO: %.3f\n", areaCirculo); 
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio); 
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado); 
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo); 
    }
 
}
