package estructuras.state.structure;

public class ConcreteState1 implements IState {
    // Métodos y atributos

    @Override
    public void handle() {
        // Lógica para imlementar el método del contexto
        System.out.println("ConcreteState1 > handle > ejecutando lógica en el estado 1");
    }
}
