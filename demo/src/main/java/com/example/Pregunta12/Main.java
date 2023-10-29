package com.example.Pregunta12;

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
            lista.remove(i);
            System.out.println("eliminado");
        }
        for(Numeros listaNumeros:lista){
            System.out.println(listaNumeros);
        }
    }
}
