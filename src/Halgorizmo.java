import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meri on 26/05/2016.
 */
public class Halgorizmo {
    private S mapa;

    public void ejecutar(S mapaPar)
    {
        this.mapa = mapaPar;

        final int[][] L = new int[mapa.nodos.size()][mapa.nodos.size()]; //Matriz de adyacencia
        final List<Coste> G = new ArrayList<>();

        for (Nodo i : mapa.nodos)
        {
            for(Nodo j : mapa.nodos)
            {
                G.add(new Coste(i, j, L[i.id][j.id] + L[j.id][1]));
            }
        }

        for(int i = 1; i <= mapa.nodos.size() - 1; i++)
        {
            for(int k = 1; k <= mapa.nodos.size() - 1; k++)
            {
                for(Coste c : G)
                {
                    S s = c.conjunto;


                }
            }
        }
    }
}
