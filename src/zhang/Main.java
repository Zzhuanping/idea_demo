package zhang;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Main().add(10,21));
        otherMethod();
    }

    private String add(int x ,int y)
    {
        return "结果是："+x+y;

    }

    public static void otherMethod(){


        System.out.println("why can i not push this");
    }

}