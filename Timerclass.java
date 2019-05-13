import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Timerclass implements ChefListener {

    private Integer secondpassed = 0;
    int customer = 0;
    private Timer timer = new Timer();
    private CrabProcess data = new CrabProcess();
    public ArrayList<CustomerOrder> Order = new ArrayList<>();



    private TimerTask Timer = new TimerTask() {
        @Override
        public void run() {
            Random rand = new Random();
            int rand_location = rand.nextInt(3);
            int rand_location2 = rand.nextInt(3);
            try {
                data.readCustomer("F:\\IdeaProjects\\CrabFood\\Customer.txt");
                data.readRestaurant("F:\\IdeaProjects\\CrabFood\\InputRestaurant.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (secondpassed == 0)
            System.out.println(secondpassed + ": a new day has start!");
               if (secondpassed == data.getTimeCustomer(customer)){
                    System.out.println(secondpassed + ": Customer " + customer + " wants to order " + data.getDishesCustomer(customer) + " from " + data.getRestaurantCustomer(customer));
                    System.out.println(secondpassed + ": Branch of " + data.getRestaurantCustomer(customer) + " at " + data.getLocationRestaurant(rand_location2,rand_location) + " take the order");
                    Integer completetime = data.getDishesTimeRestaurant(data.getIndexRestaurant(data.getRestaurantCustomer(customer)),data.getDishesCustomer(customer));
                    CustomerOrder newOrder = new CustomerOrder(customer,data.getDishesCustomer(customer),data.getRestaurantCustomer(customer),completetime);
                    Order.add(newOrder);
                    customer++;
                   }
            secondpassed++;
        }



    };

    ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();




    public void start(){
        timer.schedule(Timer,1000,1000);
    }



    public void DishesReady(){

    }
}
