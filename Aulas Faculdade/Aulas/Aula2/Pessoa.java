package com.mycompany.aula2;

import java.util.Date;

public class Pessoa {
    
    String cpf;
    String nome;
    String sobrenome;
    Endereco endereco;
    Date dataNascimento;
    
    public Pessoa (String nomeParametro) {
        this.nome= nomeParametro;
        
    }
    
    public Pessoa() {
        
    }
}
