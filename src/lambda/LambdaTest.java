package lambda;

public class LambdaTest {

    public static void main(String[] args) {
        //Case 1:
        new Thread(new Runnable(){
            public void run(){
                System.out.println("thread");
            }
        }).start();

        //Case 2:
        new Thread(()->System.out.println("lambda thread")).start();

        //Case 3:
        Runnable r = () -> System.out.println("lambda expression");
        Thread t = new Thread(r);
        t.start();
    }
}

