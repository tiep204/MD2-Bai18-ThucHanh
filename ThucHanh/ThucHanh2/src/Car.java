import java.util.Random;

public class Car implements Runnable{
    ////khai báo tên của xe đua

    private String name;
    public Car(String name){
        this.name = name;
    }
    @Override
    public void run() {
        //// khởi tạo điểm start( hay km ban đầu)
        int runDistance = 0;
        //// khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        //// kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < Main.DISTANCE){
            try {
                int speed = ( new Random()).nextInt(20);

                runDistance += speed;
                String log = " | ";
                int percentTravel = (runDistance * 100)/ Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i+= Main.STEP) {
                    log += "";
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >=i && percentTravel < i + Main.STEP) {
                        log += "O";
                    }else{
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "km");
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                System.out.println("Car" + this.name + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Ve dich" + (endTime - startTime)/1000 + "s");

    }


}
