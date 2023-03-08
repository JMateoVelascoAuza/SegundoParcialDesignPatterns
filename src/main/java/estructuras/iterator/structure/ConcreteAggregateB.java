package estructuras.iterator.structure;

import java.util.Vector;

public class ConcreteAggregateB implements IAggregate {
    // Lógica de algún objeto que almacene objetos
    private Vector<String> nameList;


    public ConcreteAggregateB(){
        nameList = new Vector<>();
    }

    public void add(String value){
        nameList.add(value);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorB(nameList);
    }
}
