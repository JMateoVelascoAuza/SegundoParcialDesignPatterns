package estructuras.iterator.structure;

public class ConcreteAggregateA implements IAggregate {
    // Lógica de algún objeto que almacene objetos
    private int position;
    private String[] nameList;

    public ConcreteAggregateA(){
        nameList = new String[5];
    }

    public void add(String value){
        nameList[position] = value;
        position++;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorA(nameList);
    }
}
