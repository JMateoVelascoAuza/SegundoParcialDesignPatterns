package estructuras.visitor.structure;

public class Client {
    public static void main(String[] args){
        ConcreteVisitor visitor = new ConcreteVisitor();
        ConcreteElement1 concreteElement1 = new ConcreteElement1();
        ConcreteElement2 concreteElement2 = new ConcreteElement2();

        concreteElement1.accept(visitor);
        concreteElement2.accept(visitor);
    }
}
