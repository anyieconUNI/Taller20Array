package com.example.Pregunta8;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        
        List<Verificar> lista = new ArrayList<Verificar>();
        lista.add(new Verificar(3));
        lista.add(new Verificar(100));
        lista.add(new Verificar(268));
        lista.add(new Verificar(7));
        lista.add(new Verificar(109));
        lista.add(new Verificar(1030));
        lista.add(new Verificar(58));
        boolean datos = lista.isEmpty();
        System.out.println(datos);
    }
}
