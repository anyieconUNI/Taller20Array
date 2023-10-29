package com.example.Pregunta18;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Numeros> lista = new ArrayList<Numeros>();

        lista.add(new Numeros(5));
        lista.add(new Numeros(10));
        lista.add(new Numeros(15));
        for(int i =0;i<lista.size();i++){
            System.out.println(lista.get(i).getNum());
        }
    }
}
