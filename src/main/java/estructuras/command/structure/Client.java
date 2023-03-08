package estructuras.command.structure;

public class Client {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        ChildReceiver childReceiver = new ChildReceiver();

        ConcreteCommand1 cm1 = new ConcreteCommand1(childReceiver);
        ConcreteCommand2 cm2 = new ConcreteCommand2(childReceiver);
        ConcreteCommand3 cm3 = new ConcreteCommand3(childReceiver);

        Invoker invoker = new Invoker();

        invoker.addCommand(cm1);
        invoker.addCommand(cm2);
        invoker.addCommand(cm3);

        invoker.runCommands();
    }
}
