package learn_code_with_durgesh;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("index" + i);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        };
        Thread t = new Thread(thread);
        t.setName("ali");
        t.start();
    }
}
