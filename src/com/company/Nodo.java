package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meri on 26/05/2016.
 */
public class Nodo {
    public final int id;
    public final List<Conexion> vecinos = new ArrayList<>();

    public Nodo(int id)
    {
        this.id = id;
    }

    public void addVecino(Nodo vecino, int coste)
    {
        Conexion conexion = new Conexion(this, vecino, coste);
        vecinos.add(conexion);
    }
}
