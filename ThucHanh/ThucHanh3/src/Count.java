public class Count implements Runnable{

    private Thread myThread;
    public Count(){
        myThread = new Thread(this, "chu de chay duoc cua toi: ");
        System.out.println("chu de cua toi da tao "+ myThread);
        myThread.start();
    }
    public Thread getMyThread(){
        return myThread;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("in so luong " +i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println("luồng của tôi bị gián đoạn ");
        }
        System.out.println("chuoi chay cua toi da ket thuc");
    }
}
