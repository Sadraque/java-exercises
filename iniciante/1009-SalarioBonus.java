import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String nome;
    static double vendas, salarioFixo;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        nome = in.nextLine();
        salarioFixo = in.nextDouble();
        vendas = in.nextDouble();

        salarioFixo += gerarComissao(vendas);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFixo);

    }

    public static double gerarComissao(double totalVendas) {

        return (totalVendas * 0.15);
    } 

}
