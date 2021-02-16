import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);

        int codigoPrimeiraPeca = in.nextInt();
        int quantidadePrimeiraPeca = in.nextInt();
        double valorPrimeiraPeca = in.nextDouble();
       
        int codigoSegundaPeca = in.nextInt();
        int quantidadeSegundaPeca = in.nextInt();
        double valorSegundaPeca = in.nextDouble();

        double total = (quantidadePrimeiraPeca * valorPrimeiraPeca) + (quantidadeSegundaPeca * valorSegundaPeca);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total); 

    }
 
}
