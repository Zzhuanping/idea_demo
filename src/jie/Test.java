package jie;

public class Test {
    private  String new_change;
    private  int    version;

    public Test(String new_change, int version) {
        this.new_change = new_change;
        this.version = version;
    }

    @Override
    public String toString() {
        return "now:{" +
                "new_change='" + new_change + '\'' +
                ", version=" + version +
                '}';
    }
}
