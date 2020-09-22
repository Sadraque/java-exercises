import java.io.IOException;
import java.util.Scanner;

public class Main {

  static double a, b, c, media;

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);

      a = in.nextDouble();
      b = in.nextDouble();
      c = in.nextDouble();

      media = ((a * 2) + (b * 3) + (c * 5)) / 10.0;

      System.out.printf("MEDIA = %.1f\n", media);

    }

}
