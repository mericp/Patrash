package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meri on 26/05/2016.
 */
public class Mapa {
    public final List<Nodo> nodos;

    public Mapa() {
        this.nodos = new ArrayList<>();
    }

    public void addNodo(Nodo nodo)
    {
        nodos.add(nodo);
    }
}
