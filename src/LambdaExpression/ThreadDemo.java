package LambdaExpression;

public class ThreadDemo {
    public static void main(String[] args) {
        //First Thread:Thread -JOHN

        Runnable thread1=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try{
                    Thread.sleep(1000);

                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();

        Runnable thread2=()->{

                for(int i=1;i<=5;i++){
                    System.out.println("This Value is "+i);
                }
            try {
                Thread.sleep(3000);

            }
            catch(InterruptedException e2){
                e2.printStackTrace();
            }
        };

        Thread obj=new Thread(thread2);
        obj.start();

    }
}
