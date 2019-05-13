import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledTask {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    /*public void StartCook(){
        final Runnable cook = new Runnable(){
            public void run(){
                System.out.println("Branch of" + "at" + "finish the order and delivery the food to customer");
            }
        }
    }*/

}
