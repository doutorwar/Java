package Exercicio24;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        //char só guarda uma letra, e deve ser salvo com ''
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("Digite um número");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O numero é zero");
            } else {
                if(numero > 0){
                    System.out.println("O numero é maior que zero");
                } else {
                    System.out.println("O numero é menor que zero");
                }
            }
            
            //chart(0) pega a primeira letra do que é escrito
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitorScanner.next().charAt(0);
            
        }
        
    }
}
