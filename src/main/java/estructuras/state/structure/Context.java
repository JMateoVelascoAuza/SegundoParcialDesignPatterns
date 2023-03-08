package estructuras.state.structure;

public class Context {
    private String attr1;
    private String attr2;
    private String attr3;
    private IState state = new ConcreteState1();

    public Context(){}

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request(){
        this.state.handle();
    }

    public void requestCS1(){
        // Logica relacionada con el CS1
    }

    public void requestCS2(){
        // Logica relacionada con el CS2
    }

    public void requestCS3(){
        // Logica relacionada con el CS3
    }
}
