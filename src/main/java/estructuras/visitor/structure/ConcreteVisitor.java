package estructuras.visitor.structure;

public class ConcreteVisitor implements IVisitor {
    @Override
    public String visitElement1(ConcreteElement1 concreteElement1) {
        // Lógica para atender el ConcreteElement1
        concreteElement1.attribute1 = "alg1 attr1";
        concreteElement1.attribute2 = "alg1 attr2";
        System.out.println("Aplicando visitante en elemento 1");
        return "Aplicando visitante en elemento 1";
    }

    @Override
    public String visitElement2(ConcreteElement2 concreteElement2) {
        // Lógica para atender el ConcreteElement2
        concreteElement2.attribute1 = "alg2 attr1";
        concreteElement2.attribute2 = "alg2 attr2";
        System.out.println("Aplicando visitante en elemento 2");
        return "Aplicando visitante en elemento 2";
    }
}
