import java.io.*;
import java.util.*;

public class CrabProcess {
    private ArrayList<CustomerDetails> customerdetails = new ArrayList<>();
    private ArrayList<RestaurantData> restaurantdata = new ArrayList<>();
    private ArrayList<DishesDetails> dishesdata = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> location;

    void readCustomer(String filename) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder allInfo = new StringBuilder();
        String[] splitter;
        StringBuilder trash = null;
        while ((line = read.readLine()) != null) {
            if (isStringInt(line)) {
                int time = Integer.parseInt(line);
                allInfo.append(time).append(",");
            } else if (line.equals(" ")) {
                assert false;
                trash.append(line);
            } else {
                StringBuilder append = allInfo.append(line).append(",");
            }
        }
        splitter = allInfo.toString().split(",");
        for (int i = 0; i < splitter.length; i += 4) {
            Integer time = Integer.valueOf(splitter[i]);
            String Restaurant = splitter[i + 1];
            String Dishes = splitter[i + 2];
            CustomerDetails newOrder = new CustomerDetails(time, Restaurant, Dishes);
            customerdetails.add(newOrder);
        }
    }

    void readRestaurant(String filename) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder allInfo = new StringBuilder();
        String[] splitter;
        StringBuilder trash = null;
        while ((line = read.readLine()) != null) {
            if (isStringInt((line))) {
                int branchesortime = Integer.parseInt(line);
                allInfo.append(branchesortime).append(",");
            } else if (line.equals(" ")) {
                trash.append(line);
            } else {
                allInfo.append(line).append(",");
            }
        }
        splitter = allInfo.toString().split(",");
        String[] location1;
        String[] location2;
        String[] location3;
        int[] newlocation1 = new int[2];
        int[] newlocation2 = new int[2];
        int[] newlocation3 = new int[2];
        RestaurantData method = new RestaurantData();
        for (int i = 0; i < splitter.length; i += 11) {
            HashMap<String, Integer> dishes = new HashMap<>();
            location = new ArrayList<>(3);
            for (int d = 0; d < 3; d++) {
                location.add(new ArrayList());
            }
            String name = splitter[i];
            location1 = splitter[i + 1].split(" ");
            for (int a = 0; a < location1.length; a++) {
                newlocation1[a] = Integer.parseInt(location1[a]);
            }
            location2 = splitter[i + 2].split(" ");
            for (int b = 0; b < location2.length; b++) {
                newlocation2[b] = Integer.parseInt(location2[b]);
            }
            location3 = splitter[i + 3].split(" ");
            for (int c = 0; c < location3.length; c++) {
                newlocation3[c] = Integer.parseInt(location3[c]);
            }
            String dishes1 = splitter[i + 4];
            Integer timedishes1 = Integer.parseInt(splitter[i + 5]);
            String dishes2 = splitter[i + 6];
            Integer timedishes2 = Integer.parseInt(splitter[i + 7]);
            String dishes3 = splitter[i + 8];
            Integer timedishes3 = Integer.parseInt(splitter[i + 9]);
            location.get(0).add(newlocation1[0]);
            location.get(0).add(newlocation1[1]);
            location.get(1).add(newlocation2[0]);
            location.get(1).add(newlocation2[1]);
            location.get(2).add(newlocation3[0]);
            location.get(2).add(newlocation3[1]);
            dishes.put(dishes1, timedishes1);
            dishes.put(dishes2, timedishes2);
            dishes.put(dishes3, timedishes3);
            RestaurantData newRestaurant = new RestaurantData(name,location,dishes);
            restaurantdata.add(newRestaurant);
        }
    }

    private boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public String toString(ArrayList<ArrayList<Integer>>  myBoard){
        StringBuilder result = new StringBuilder();
        for (ArrayList<Integer> integers : myBoard) {
            for (Integer integer : integers) result.append(integer);
            result.append("\n");
        }
        return result.toString();
    }

    public String getRestaurantCustomer(int index){
        return customerdetails.get(index).getRestaurant();
    }

    public int getTimeCustomer(int index){
        return customerdetails.get(index).getTime();
    }

    public String getDishesCustomer(int index){
        return customerdetails.get(index).getDishes();
    }

    public int getSizeCustomer(int index){
        return customerdetails.size();
    }


    public int getSizeCustomer(){
        return customerdetails.size();
    }

    ArrayList<RestaurantData> getRestaurantdata(){
        return restaurantdata;
    }
    public String getNameRestaurant(int index){
        return restaurantdata.get(index).getName();
    }

    Integer getDishesTimeRestaurant(int index, String namedish){
        return restaurantdata.get(index).getDishes().get(namedish);
    }

    public Integer getIndexOfDishes(String restaurantname){
        for (RestaurantData test : restaurantdata){
            if (test.getName().equals(restaurantname)){
                return restaurantdata.indexOf(test);
            }
        }
        return -1;
    }

    public HashMap<String, Integer> getDishes(int index){
        return restaurantdata.get(index).getDishes();
    }

    public ArrayList<Integer> getLocationRestaurant(int index,int random){
        return restaurantdata.get(index).getLocation().get(random);
    }

    public Integer getIndexRestaurant(String restaurant){
        for (int i = 0; i < restaurantdata.size(); i++){
            if (getNameRestaurant(i).equals(restaurant))
                return i;
        }
        return -1;
    }

    Integer getLocationRestaurant(int index, int whichbranch, int whichelement){
        return restaurantdata.get(index).getLocation().get(whichbranch).get(whichelement);
    }
    private Integer getSizeofLocation(int index){
        return restaurantdata.get(index).getLocation().size();
    }

    public Integer[] LocationtoArray(int index){
        Integer[] locations = new Integer[6];
        for (int i = 0; i < getSizeofLocation(index); i++){
            for (int j = 0; j < 2; j++){
                locations[i] = getLocationRestaurant(index,i,j);
            }
        }
        return locations;
    }


    Character getFirstNameChar(int index){
        return restaurantdata.get(index).getName().charAt(0);
    }




}

