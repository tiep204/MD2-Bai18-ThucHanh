public class Main {
    public static void main(String[] args) {
        System.out.println("Chu de chinh dang chay... ");
        RunnableDemo runnableDemo1 = new RunnableDemo("Luồng-1-HR-Cơ sở dữ liệu\n");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Chuỗi-2-Gửi-Email\n");
        runnableDemo2.start();

        System.out.println("Chủ đề chính đã dừng lại !!!\n");
     }
}