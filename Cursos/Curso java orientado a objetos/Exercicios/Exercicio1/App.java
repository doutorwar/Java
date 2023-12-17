package Exercicio1;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        //Faça um algoritmo que receba dois números e exiba o resultado da sua soma

        int numero1, numero2, resultado = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero a ser somado:");
            numero1 = s.nextInt();
            
        System.out.println("informe o segundo numero a ser somado:");
            numero2 = s.nextInt();
            
        resultado = numero1 + numero2;
       
       System.out.println("o resultado da soma é:" + resultado);
    }
}
