package estructuras.state.structure;

public class ConcreteState2 implements IState {
    // Métodos y atributos

    @Override
    public void handle() {
        // Lógica para imlementar el método del contexto
        System.out.println("ConcreteState2 > handle > ejecutando lógica en el estado 2");
    }
}
