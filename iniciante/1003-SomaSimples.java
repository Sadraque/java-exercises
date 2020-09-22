import java.io.IOException;
import java.util.Scanner;

public class Main {

  static int a, b, soma;

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);

      a = in.nextInt();
      b = in.nextInt();

      soma = a + b;

      System.out.println("SOMA = " +soma);

    }

}
