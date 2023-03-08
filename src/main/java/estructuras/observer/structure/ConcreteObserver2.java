package estructuras.observer.structure;

public class ConcreteObserver2 implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserver2 tiene una notificación de un evento");
        System.out.println("Msg: " + msg);
    }
}
