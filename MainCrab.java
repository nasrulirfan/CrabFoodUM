import java.io.IOException;
import java.util.Timer;

public class MainCrab {
    public static void main(String[] args) throws IOException {
        CrabProcess test = new CrabProcess();
        Timerclass test2 = new Timerclass();
        CustomerDetails test3 = new CustomerDetails();
        Map test4 = new Map();
        test.readCustomer("F:\\IdeaProjects\\CrabFood\\Customer.txt");
        test.readRestaurant("F:\\IdeaProjects\\CrabFood\\InputRestaurant.txt");
        System.out.println(test.getRestaurantdata());
        System.out.println(test.getDishesTimeRestaurant(0,"Crabby Patty"));
        test4.makeinitialmap();
        test4.printmap();
        //test2.start();




    }


}
