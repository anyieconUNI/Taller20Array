package com.example.Pregunta2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Lista> lista1 = new ArrayList<Lista>();
        lista1.add(new Lista(1));
        lista1.add(new Lista(10));
        lista1.add(new Lista(4));
        lista1.add(new Lista(7));
        lista1.add(new Lista(100));
        boolean datos = lista1.isEmpty();
        System.out.println(datos);
    }
    
}
