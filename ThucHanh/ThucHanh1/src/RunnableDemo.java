public class RunnableDemo implements Runnable {
    private Thread t;
    private final  String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Dang tao " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Dang chay " + threadName);
        try {
            for (int i = 4; i >0; i--) {
                System.out.println("chu de " + threadName + " , " + i);

                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("chu de " + threadName + "bi gian doan ");
        }
        System.out.println("chu de " + threadName + "thoat ra ");
    }
    public void start(){
        System.out.println("bat dau " + threadName);
        if(t == null){
           t = new Thread(this, threadName);
            t.start();
        }
    }
}
