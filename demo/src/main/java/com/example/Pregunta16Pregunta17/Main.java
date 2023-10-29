package com.example.Pregunta16;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int ultimo=0;
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("1"));
        lista.add(new Nombres("2"));
        lista.add(new Nombres("2"));
        lista.add(new Nombres("44"));
        lista.add(new Nombres("100"));
        System.out.println("Primer Dato: "+lista.get(0).getNombre());
        for(int i =0;i<lista.size();i++){
            ultimo =i;
        }
        System.out.println("Ultimo Dato: "+lista.get(ultimo).getNombre());

    }
}


