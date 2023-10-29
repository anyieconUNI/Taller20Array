package com.example.Pregunta10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
        List<Numeros> lista = new ArrayList<Numeros>();
        lista.add(new Numeros(1));
        lista.add(new Numeros(2));
        lista.add(new Numeros(2));
        lista.add(new Numeros(44));
        lista.add(new Numeros(100));
        for(int i =0;i<lista.size();i++){
            System.out.println(lista.get(i).getNum());
        }
    }
}
