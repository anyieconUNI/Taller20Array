package com.example.Pregunta5;

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
        int tercerNumero = lista.get(3).getNum();

        System.out.println("el tercer numero es " + tercerNumero);
    }
}
