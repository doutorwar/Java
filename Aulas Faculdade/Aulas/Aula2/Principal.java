package com.mycompany.aula2;

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("TESTE");
        
        Pessoa p1 = new Pessoa("Felipe");
        Pessoa p2 = new Pessoa();
        Pessoa a1 = new Aluno();
        Coordenador c1 = new Coordenador();
        
        p1.nome= "Felipe";
        p1.sobrenome= "Pinheiro";
        c1.numIdentificacao = "ABC";
        c1.baterPonto();
        
                System.out.println(p1.nome + " " + p1.sobrenome + ", " + c1.numIdentificacao);
    }
    
}
