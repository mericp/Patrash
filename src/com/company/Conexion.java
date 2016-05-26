package com.company;

/**
 * Created by Meri on 26/05/2016.
 */
public class Conexion {
    private final Nodo inicio;
    private final Nodo destino;
    private final int coste;


    public Conexion(Nodo inicio, Nodo destino, int coste) {
        this.inicio = inicio;
        this.destino = destino;
        this.coste = coste;
    }
}
