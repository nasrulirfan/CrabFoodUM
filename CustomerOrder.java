public class CustomerOrder {
    Integer ID;
    String dishes;
    String restname;

    public CustomerOrder (Integer a, String b, String c){
        this.ID = a;
        this.dishes = b;
        this.restname = c;
    }

    public CustomerOrder(){
        this.ID = null;
        this.dishes = null;
        this.restname = null;
    }

    public String toString() {
        return  "Customer ID = " + ID + "\nDish name = " + dishes + "\nRestaurant = " + restname;
    }
}
