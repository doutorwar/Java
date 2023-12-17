package Exercicio4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
    /* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
        por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
        efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
    */
    
        String nomeVendedor = "a";
        double salario, totalVendas, resultadocomissao, comissao = 1.0d;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("informe o nome do vendedor:");
            nomeVendedor = s.nextLine();
            
        System.out.println("informe o salario fixo do vendedor:");
            salario = s.nextDouble();
            
        System.out.println("informe o total de vendas efetuadas pelo vendedor em dinheiro:");
            totalVendas = s.nextDouble();
        
            
        comissao = totalVendas * 0.15;
        resultadocomissao = comissao + salario;
       
       System.out.println("O vendedor: " + nomeVendedor + ", recebe o salario fixo de: " + salario + ", e receberá o salario de: " + resultadocomissao + "R$ com o valor de sua comissão");
        
    }
}
