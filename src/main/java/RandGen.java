import java.util.Random;

public class RandGen {

    public static final int RATE_PER_MIN = 5;

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        while(true) {

            for(int i=0;i<RATE_PER_MIN;i++){
                System.out.print(rand.nextInt(1000));
                if(i != RATE_PER_MIN-1)
                    System.out.print(", ");

            }


            Thread.sleep(1000);
            System.out.println();
        }
    }
}
