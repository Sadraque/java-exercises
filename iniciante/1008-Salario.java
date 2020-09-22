import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int numeroFuncionario, horasTrabalhadas;
    static double valorHoraTrabalhada, salario;

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);

      numeroFuncionario = in.nextInt();
      horasTrabalhadas = in.nextInt();
      valorHoraTrabalhada = in.nextDouble();

      salario = horasTrabalhadas * valorHoraTrabalhada;

      System.out.println("NUMBER = " +numeroFuncionario);
      System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}
