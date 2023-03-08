package estructuras.interpreter.structure;

public class Client {
    public static void main(String[] args){
        String msg = "A A A B B C";
        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);
        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());
    }
}
