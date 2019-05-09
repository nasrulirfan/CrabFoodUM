public class CustomerDetails {
    Integer time;
    String Restaurant;
    String dishes;

    public CustomerDetails (Integer a, String b, String c){
        this.time = a;
        this.Restaurant = b;
        this.dishes = c;
    }

    public CustomerDetails(){
        this.time = null;
        this.Restaurant = null;
        this.dishes = null;
    }

    public CustomerDetails(int a){
        this.time = a;
    }


    public String toString() {
        return  "Restaurant name = " + Restaurant + "\nDish name = " + dishes + "\nArrival time = " + time;
    }

    public String getRestaurant(){
        return Restaurant;
    }
    public int getTime(){
        return time;
    }

    public String getDishes(){
        return dishes;
    }

    public void addtime(int a){
        time = a;
    }

    public void addRestaurant (String a){
        Restaurant = a;
    }

    public void addDishes (String a){
        dishes = a;
    }


}
