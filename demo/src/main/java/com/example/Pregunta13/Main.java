package com.example.Pregunta13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("America"));
        lista.add(new Nombres("Hanna"));
        lista.add(new Nombres("Herrera"));
        Nombres nuevoNombre = new Nombres("Pedro");
        lista.add(1, nuevoNombre);
        for (Nombres persona:lista) {
                System.out.println( persona.getnombres());
            }
    }
}
