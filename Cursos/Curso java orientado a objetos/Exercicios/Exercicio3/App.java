package Exercicio3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto
        
        int distancia, combustivel, resultado = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("calculo de consumo médio de um automóvel");
        System.out.println("informe a distancia percorrida pelo automovel:");
            distancia = s.nextInt();
            
        System.out.println("informe o total de combustivel no tanque:");
            combustivel = s.nextInt();
            
        resultado = distancia / combustivel;
       
       System.out.println("este veiculo tem o consumo medio de: " + resultado + " quilometros a cada litro de combustivel");
       
    }
}
