package com.example.Pregunta6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("America"));
        lista.add(new Nombres("Hanna"));
        lista.add(new Nombres("Herrera"));
        lista.get(1).setnombres("Ana");
        for (Nombres persona:lista) {
                System.out.println("prueba " + persona.getnombres());
            }
    }
}
