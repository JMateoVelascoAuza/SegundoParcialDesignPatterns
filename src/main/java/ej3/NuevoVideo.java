package ej3;

public class NuevoVideo implements INotification{

    private String msg = "Se subio nuevo video";

    @Override
    public String getMsg() {
        return msg;
    }
}
