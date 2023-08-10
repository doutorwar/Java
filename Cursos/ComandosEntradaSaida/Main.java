package ComandosEntradaSaida;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        //ENTRADA
        Scanner leitor = new Scanner(System.in);
        
        //cria uma variavel inteira e guarda dentro dela a proxima linha que for inteira dentro dela
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        //le uma linha de texto ate que seja pressionado enter
        String nome = leitor.nextLine();
        //next le uma palavra
        String codigoRua = leitor.next();
        
        //SAIDA
        System.out.println("texto que sera exibido no console");
        //println imprime o texto e pula pra proxima linha
        System.out.print("texto que sera exibido no console e depois pula linha");
        //print apenas imprime o texto e nao pula pra proxima linha
        
    }
}
