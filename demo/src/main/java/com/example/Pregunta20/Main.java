package com.example.Pregunta20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PrimerLista> lista = new ArrayList<PrimerLista>();
        List<SegundaLista> lista2 = new ArrayList<SegundaLista>();
        List<TerceraLista> lista3 = new ArrayList<TerceraLista>();
        boolean datos = lista.isEmpty();
        boolean datos2 = lista2.isEmpty();
        boolean datos3 = lista3.isEmpty();
        System.out.println(datos + "," + datos2 + "," + datos3);
    }
}
