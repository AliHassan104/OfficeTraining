package telusko;


@FunctionalInterface //one method only
interface A{
    void run();

    // String toString(); // 3) but we can create this
}

// 2)
class B implements A{

    @Override
    public void run() {
        System.out.println("Hi");
    }
}

public class Demo {

    public static void main(String[] args) {
        //A a = new A();  // 1) can create object of it


        A a1 = new B(); // 2) we can create object of A like this
        a1.run();

        // 3) every class in java extends Object


        // 4) we can create object of interface using anonymous class
        A a2 = new A() {
            @Override
            public void run() {
                System.out.println("Hi in anonymous class");
            }
        };

        // we were using  above syntax till java 7 then comes lambdas expression

        // 5) so we removed new A access modifier return type and method name because it has only one method but () is present for parameters

        A a3 =  () -> {System.out.println("hi in lambdas expression"); };

        // or

        A a4 =  () -> System.out.println("hi in lambdas expression");



    }

}
