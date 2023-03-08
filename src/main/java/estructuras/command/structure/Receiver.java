package estructuras.command.structure;

public class Receiver {
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public Receiver() {
        attribute1 = "My attribute1";
        attribute2 = "My attribute2";
        attribute3 = "My attribute3";
    }

    public void operation1(){
        System.out.println("Receiver - Operation1");
    }

    public void operation2(){
        System.out.println("Receiver - Operation2");
    }

    public void operation3(){
        System.out.println("Receiver - Operation3");
    }
}
