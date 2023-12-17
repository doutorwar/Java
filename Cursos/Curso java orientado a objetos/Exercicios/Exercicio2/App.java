package Exercicio2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        //Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;

        int numero1, numero2, resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero:");
            numero1 = s.nextInt();
            
        System.out.println("informe o segundo numero:");
            numero2 = s.nextInt();
            
        resultadoSoma = numero1 + numero2;
        resultadoSubtracao = numero1 - numero2;
        resultadoMultiplicacao = numero1 * numero2;
        resultadoDivisao = numero1 / numero2;
       
       System.out.println("o resultado da soma é:" + resultadoSoma);
       System.out.println("o resultado da subtração é:" + resultadoSubtracao);
       System.out.println("o resultado da multiplicação é:" + resultadoMultiplicacao);
       System.out.println("o resultado da divisão é:" + resultadoDivisao);
       
    }
}
