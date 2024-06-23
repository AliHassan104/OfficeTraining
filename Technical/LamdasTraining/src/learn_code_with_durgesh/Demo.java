package learn_code_with_durgesh;

interface sumInter{
    public int sum(int a, int b);
}

public class Demo {

    public static void main(String[] args) {

        sumInter inter = (int a , int b) -> a+b;

    }
}
