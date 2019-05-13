import java.util.ArrayList;

public class CustomerOrder {
    private Integer ID;
    private String dishes;
    private Integer completetime;
    private String restname;
    private ArrayList<Integer> location;

    public CustomerOrder (Integer a, String b,String c ,Integer completetime){
        this.ID = a;
        this.dishes = b;
        this.restname = c;
        this.completetime = completetime;
        //this.location = Location;
    }

    public CustomerOrder(){
        this.ID = null;
        this.dishes = null;
        this.restname = null;
        this.completetime = null;
        this.location = null;
    }

    public String getRestaurantCustomer(){
        return restname;
    }

    public String getDishes(){
        return dishes;
    }

    public Integer getCompletetime(){return completetime;}

    public ArrayList<Integer> Location (){
        return location;
    }

    public String toString() {
        return  "Customer ID = " + ID + "\nDish name = " + dishes +"\nTime = " + completetime + "\nRestaurant = " + restname + "\nLocation = " + location;
    }


}
