package com.mycompany.tema3;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Integer x = 5;
        Integer y = 0;
        Integer resultado = 0;
        
        System.out.println("divisao de " + x + " por " + y);
        
        try{
        resultado = x/y;
        }
        catch(ArithmeticException excecao){
            System.out.println(excecao.getMessage());
            System.out.println(excecao.getCause());
            //JOptionPane.showMessageDialog(null, "nao existe divisao por zero");
            //dividir();
        }
        finally{
            System.out.println("dentro do finally");
        }
        
            System.out.println("resultado da divisao = " + resultado);
            
            
            
        }
            
        //private static void dividir(Integer X, Integer y) {
        //}
  
}
