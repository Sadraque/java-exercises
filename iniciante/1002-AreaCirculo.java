import java.io.IOException;
import java.util.Scanner;

public class Main {

  static double PI = 3.14159;
  static double area, raio;

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);

      raio = in.nextDouble();

      area = PI * (raio * raio);

      System.out.printf("A=%.4f\n", area);

    }

}
