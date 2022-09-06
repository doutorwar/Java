package com.mycompany.colecoesaula3;

public class Principal2 {

    public static void main(String[] args) {
        Aluno aluno1, aluno2, aluno3, aluno4, aluno5;
        
        aluno1 = new Aluno("Tio Patinhas","20221");
         aluno2 = new Aluno("Pato Donald","20222");
          aluno3 = new Aluno("Pateta","20223");
           aluno4 = new Aluno("Mickey","20224");
            aluno5 = new Aluno("Pluto","20225");
            
         Laboratorio   info2 = new Laboratorio("INFO 2");
         
         info2.alocarAlunos(aluno1);
         info2.alocarAlunos(aluno2);
         info2.alocarAlunos(aluno3);
         info2.alocarAlunos(aluno4);
         info2.alocarAlunos(aluno5);
         
         System.out.println(info2.exibirAlunos());
          
    }
    
}
