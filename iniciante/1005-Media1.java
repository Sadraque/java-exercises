import java.io.IOException;
import java.util.Scanner;

public class Main {

  static double a, b, media;

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);

      a = in.nextDouble();
      b = in.nextDouble();

      media = ((a * 3.5) + (b * 7.5)) / 11;

      System.out.printf("MEDIA = %.5f\n", media);

    }

}
