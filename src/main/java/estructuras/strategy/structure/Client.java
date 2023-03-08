package estructuras.strategy.structure;

public class Client {
    public static void main(String[] args){
        Context context = new Context("1", "2", "3");
        context.setStrategy(new ConcreteStrategy2());
        context.execute();
    }
}
