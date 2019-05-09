import java.io.IOException;
import java.util.Timer;

public class MainCrab {
    public static void main(String[] args) throws IOException {
        CrabProcess test = new CrabProcess();
        Timerclass test2 = new Timerclass();
        CustomerDetails test3 = new CustomerDetails();
        test.readCustomer("F:\\IdeaProjects\\CrabFood\\Customer.txt");
        test.readRestaurant("F:\\IdeaProjects\\CrabFood\\InputRestaurant.txt");
        System.out.println(test.LocationtoArray(0).toString());
        test2.start();;
        //test2.start();




    }


}
