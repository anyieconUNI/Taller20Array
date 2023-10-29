package com.example.Pregunta3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int NumeroMayor = 0;
    
        List<Numeros> lista = new ArrayList<Numeros>();
        lista.add(new Numeros(10000000));
        lista.add(new Numeros(110000));
        lista.add(new Numeros(1050));
        lista.add(new Numeros(700));
        lista.add(new Numeros(100));
        int Mayor = lista.get(0).getNum();
        for (int i = 0; i < lista.size(); i++){
            NumeroMayor = lista.get(i).getNum();
            if (NumeroMayor > Mayor){
                Mayor = NumeroMayor;
            }
        }
        System.out.println("el numero mayor es " + Mayor);
    }
}

