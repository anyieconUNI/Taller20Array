package com.example.Pregunta14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nombres> lista = new ArrayList<>();
        lista.add(new Nombres("America"));
        lista.add(new Nombres("Hanna"));
        lista.add(new Nombres("Herrera"));
        
        String[] array = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i).getNombre();
        }
        for (String str : array) {
            System.out.println(str);
        }
    }
}
