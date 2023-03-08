package estructuras.observer.structure;

public interface ISubject {
    // Agregar observadores
    void attach(IObserver observer);

    // Eliminar observadores
    void detach(IObserver observer);

    // Notificar a los observadores
    void notifyObservers(String msg);
}
