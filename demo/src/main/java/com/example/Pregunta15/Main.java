package com.example.Pregunta15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de nombres
        List<Nombres> lista = new ArrayList<>();
        lista.add(new Nombres("America"));
        lista.add(new Nombres("canna"));
        lista.add(new Nombres("aerrera"));

        // Ordenar alfabéticamente utilizando un comparador diciendo como se deben ordenar como un metodo
        Collections.sort(lista, new Comparator<Nombres>() {
            @Override
            public int compare(Nombres nombre1, Nombres nombre2) {
                return nombre1.getNombre().compareTo(nombre2.getNombre());
            }
        });

        // Imprimir la lista ordenada
        for (Nombres nombre : lista) {
            System.out.println(nombre.getNombre());
        }
    }
}


