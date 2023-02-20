package zhang;

import jie.Test;

public class Main {
    public static void main(String[] args) {
         printVersion(new Test("None",1));
        System.out.println(new Main().add(10,21));
        otherMethod();



    }

    private String add(int x ,int y)
    {
        return "结果是："+x+y;

    }

    public static void otherMethod(){


        System.out.println("this is main class");

    }

    static void printVersion(Test test){

        System.out.println(test);
    }

}