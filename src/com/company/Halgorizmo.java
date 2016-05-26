package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meri on 26/05/2016.
 */
public class Halgorizmo {
    private Mapa mapa;

    public void ejecutar(Mapa mapa)
    {
        mapa = new Mapa();
        final int[][] L = new int[mapa.nodos.size()][mapa.nodos.size()]; //Matriz de adyacencia
        final int[][] G = new int[mapa.nodos.size()][mapa.nodos.size()]; //Costes

        for (Nodo i : mapa.nodos)
        {
            for(Nodo j : mapa.nodos)
            {
                G[i.id][j.id] = L[i.id][j.id] + L[j.id][1];
            }
        }

        for(int i = 2; i <= mapa.nodos.size() - 2; i++)
        {
            for(int k = 2; k <= mapa.nodos.size(); k++)
            {

            }
        }
    }

    private Mapa S(int i) //Subconjunto de i nodos
    {
        Mapa subconjunto = new Mapa();

        for (int x = 0; x < i; x++)
        {
            subconjunto.nodos.add(mapa.nodos.get(x));
        }

        return subconjunto;
    }
}
