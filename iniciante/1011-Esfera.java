import java.io.IOException;
import java.util.Scanner;

public class Main {

    static double raio;
    static double PI = 3.14159;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        raio = in.nextDouble();


        System.out.printf("VOLUME = %.3f\n", calcularVolume(raio));

    }

    public static double calcularVolume(double valorRaio) {

        return ((4.0 / 3) * PI * (Math.pow(valorRaio,3)));
    }

}
