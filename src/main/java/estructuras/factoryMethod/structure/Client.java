package estructuras.factoryMethod.structure;

public class Client {
    public static void main(String[] args){
        ConcreteProduct1 product1 = new ConcreteCreatorP1().factoryMethodProduct();
        product1.create();
    }
}
