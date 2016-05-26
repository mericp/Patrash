import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meri on 26/05/2016.
 */
public class S { //conjunto de nodos (mapa)
    public final List<Nodo> nodos;

    public S() {
        this.nodos = new ArrayList<>();
    }

    public void addNodo(Nodo nodo)
    {
        nodos.add(nodo);
    }
}
