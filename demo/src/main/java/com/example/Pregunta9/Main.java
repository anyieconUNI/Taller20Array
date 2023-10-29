package com.example.Pregunta9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String nombre = "";
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("America"));
        lista.add(new Nombres("carlos"));
        lista.add(new Nombres("Herrera"));

        for(int i= 0; i<lista.size();i++){
            nombre= lista.get(i).getnombres();
            if(nombre == "carlos"){
                System.out.println("si esta el nombre carlos");
            }
        }
    }
}