import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int a, b, c, d, diferenca;

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);

      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      d = in.nextInt();

      diferenca = (a * b) - (c * d);

      System.out.println("DIFERENCA = " +diferenca);

    }

}
