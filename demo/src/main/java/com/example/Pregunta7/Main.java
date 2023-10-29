package com.example.Pregunta7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("America"));
        lista.add(new Nombres("Hanna"));
        lista.add(new Nombres("Herrera"));
        lista.remove(0);
        for (Nombres persona:lista) {
                System.out.println("Se eliminón el primer nombre solo quedan: " + persona.getnombres());
            }
    }
}
