/**
 * Created by Meri on 26/05/2016.
 */
public class Coste {
    Nodo nodo;
    S conjunto;
    int coste;

    public Coste(Nodo nodo, S conjunto, int coste)
    {
        this.nodo = nodo;
        this.conjunto = conjunto;
        this.coste = coste;
    }

    public Coste(Nodo nodo, Nodo conjuntoIndividual, int coste)
    {
        this.nodo = nodo;

        this.conjunto = new S();
        this.conjunto.addNodo(conjuntoIndividual);

        this.coste = coste;
    }
}
