package estructuras.chainOfResponsibility.structure;

public class ConcreteHandler3 implements  IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        // Logica cuando podemos solucionar el problema y somos responsables de eso
        if(amount >= 200 && amount < 300) {
            System.out.println("ConcreteHandler3 esta solucionando su problema ... " + amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
