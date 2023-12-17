package com.mycompany.colecoesaula3;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        
        List lista1 = new ArrayList();
        lista1.add("item1");
        lista1.add("item2");
        lista1.add("item3");
        lista1.add("item1");
        
        System.out.println(lista1);
        
        System.out.println(lista1.get(2));
        
        System.out.println(lista1.indexOf("item1"));
        
        
        System.out.println("\n\n\n\n Lista com SET : ");
        
        Set lista2 = new HashSet();
        lista2.add("item1");
        lista2.add("item2");
        lista2.add("item3");
        lista2.add("item1");
        
        System.out.println(lista2);
        
        System.out.println(lista2.size());
        
        System.out.println("\n\n\n\n Lista com MAP : ");
        
        Map<String, String> lista3 = new HashMap<>();
        
        lista3.put("chave1", "item1");
        lista3.put("chave2", "item2");
        lista3.put("chave3", "item3");
        
        System.out.println(lista3);
        
        System.out.println(lista3.get("chave2"));
      //  System.out.println(lista2.indexOf("item1"));
         
    }
    
}
