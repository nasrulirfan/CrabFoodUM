import java.util.ArrayList;
import java.util.HashMap;

    public class RestaurantData {
        public String name;
        public ArrayList<ArrayList<Integer>> location;
        public HashMap<String,Integer> dishes;

        RestaurantData(){
            this.name = null;
            location = null;
            this.dishes = null;
        }

        RestaurantData (String name, ArrayList<ArrayList<Integer>> location, HashMap dishes){
            this.name = name;
            this.location = location;
            this.dishes = dishes;
        }

    public static void main(String[] args) {
    }


    public void addName(String name[]){
        ArrayList name1 = new ArrayList();
        name1.add(name);
    }

    public void addDishes(String dishes){
        ArrayList dishes1 = new ArrayList();
        dishes1.add(dishes);
    }

    public String getName(){
        return name;
    }

    public ArrayList<ArrayList<Integer>> getLocation(){
        return location;
    }
    public ArrayList<Integer> getLocation(int index){
        return location.get(index);
    }

    public HashMap<String,Integer> getDishes(){
        return dishes;
    }

    public Integer getDishesTime(String namedish){
        return dishes.get(namedish);
    }




    public String toString() {
        return  "Restaurant name = " + name + "\nDish name = " + dishes + "\nLocation = " + location;
    }



  /*  public boolean contain(String restaurant){
        for (int i = 0; i < name.length(); i++) {
            if (name[i] == customername){
                return true;
            }
        }
        return false;
    }
*/










}
