package com.example.Pregunta4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lista> lista = new ArrayList<Lista>();
        lista.add(new Lista(10));
        lista.add(new Lista(15));
        lista.add(new Lista(7));
        lista.add(new Lista(26));
        lista.add(new Lista(25));
        int numero = 0;

        for (int i = 0; i < lista.size(); i++){
            numero = lista.get(i).getNum();
            if(numero % 2 != 0){
               System.out.println(numero);  
            }
            
        }
        
    }
}
