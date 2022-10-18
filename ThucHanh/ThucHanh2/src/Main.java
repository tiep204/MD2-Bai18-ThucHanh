public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;
    public static void main(String[] args) {
        Car vietAanh = new Car("vietAanh");
        Car tiepDz = new Car("Tiep dz");
        Car tinTran = new Car("tintran");
        Car HungVlog = new Car("hungVlog");

        Thread thread1 = new Thread(vietAanh);
        Thread thread2 = new Thread(tiepDz);
        Thread thread3 = new Thread(tinTran);
        Thread thread4 = new Thread(HungVlog);
        System.out.println("                             *---------------------------*");
        System.out.println("                             |     Doan duong: 100km     |" );
        System.out.println("                             *___________________________*");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}