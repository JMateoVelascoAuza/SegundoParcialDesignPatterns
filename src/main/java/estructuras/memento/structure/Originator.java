package estructuras.memento.structure;

public class Originator {
    private ConcreteObject state;

    public void setMemento(ConcreteObject state){
        System.out.println("Originator > setState > " + state.getState());
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public ConcreteObject restoreMemento(Memento m){
        this.state = m.getState();
        System.out.println("Originator > restoreMemento > " + state.getState());
        return state;
    }
}
