package jie;

public class Test {
    private  String new_change;
    private  int    version;


    @Override
    public String toString() {
        return "now:{" +
                "new_change='" + new_change + '\'' +
                ", version=" + version +
                '}';
    }
}
