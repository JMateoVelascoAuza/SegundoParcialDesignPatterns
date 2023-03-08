package estructuras.iterator.structure;

import java.util.Vector;

public class ConcreteIteratorB implements Iterator{
    private int position;
    private Vector<String> nameList;

    public ConcreteIteratorB(Vector<String> nameList) {
        this.nameList = nameList;
        position = 0;
    }

    @Override
    public Object next() {
        return nameList.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nameList.size() != 0 && position < nameList.size();
    }
}
