package estructuras.memento.structure;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    // Objeto que almacena estados
    private List<Memento> stateList = new ArrayList<>();

    public void addMemento(Memento m){
        stateList.add(m);
    }

    // Forma de obtener objetos de nuestra almacenador de objetos
    public Memento getMemento(int position){
        return stateList.get(position);
    }
}
