public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()){
                System.out.println("Chuỗi chính sẽ tồn tại cho đến khi chuỗi con hoạt động\n");
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println("chuoi chinh bi gian doan: ");
        }
        System.out.println("qua trinh chay chuoi chinh da ket thuc: ");
    }
}