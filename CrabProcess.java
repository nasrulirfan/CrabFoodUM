import java.io.*;
import java.util.*;

public class CrabProcess {
    public ArrayList<CustomerDetails> customerdetails = new ArrayList<>();
    public ArrayList<RestaurantData> restaurantdata = new ArrayList<>();
    public ArrayList<DishesDetails> dishesdata = new ArrayList<>();

    public void readCustomer(String filename) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(filename));
        String line;
        String allInfo = "";
        String[] splitter;
        String trash = null;
        while ((line = read.readLine()) != null) {
            if (isStringInt(line)) {
                int time = Integer.parseInt(line);
                allInfo += time + ",";
            } else if (line.equals(null) || line.equals(" ")) {
                trash += line;
            } else {
                allInfo += line + ",";
            }
        }
        splitter = allInfo.split(",");
        for (int i = 0; i < splitter.length; i += 4) {
            Integer time = Integer.valueOf(splitter[i]);
            String Restaurant = splitter[i + 1];
            String Dishes = splitter[i + 2];
            CustomerDetails newOrder = new CustomerDetails(time, Restaurant, Dishes);
            customerdetails.add(newOrder);
        }
    }

    public void readRestaurant(String filename) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(filename));
        String line;
        String allInfo = "";
        String[] splitter;
        String trash = null;
        while ((line = read.readLine()) != null) {
            if (isStringInt((line))) {
                int branchesortime = Integer.parseInt(line);
                allInfo += branchesortime + ",";
            } else if (line.equals(null) || line.equals(" ")) {
                trash += line;
            } else {
                allInfo += line + ",";
            }
        }
        splitter = allInfo.split(",");
        String location1[];
        String location2[];
        String location3[];
        int newlocation1[] = new int[2];
        int newlocation2[] = new int[2];
        int newlocation3[] = new int[2];
        Integer location11[][];
        RestaurantData method = new RestaurantData();
        for (int i = 0; i < splitter.length; i += 11) {
            HashMap<String, Integer> dishes = new HashMap<>();
            ArrayList<ArrayList<Integer>> location = new ArrayList<>(3);
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

    public boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public String toString(ArrayList<ArrayList<Integer>>  myBoard){
        String result = "";
        for(int i = 0; i < myBoard.size(); i++){
            for(int j = 0; j < myBoard.get(i).size(); j++){
                result += myBoard.get(i).get(j);
            }
            result += "\n";
        }
        return result;
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


    public int getSizeCustomer(){
        return customerdetails.size();
    }

    public ArrayList<RestaurantData> getRestaurantdata(){
        return restaurantdata;
    }
    public String getNameRestaurant(int index){
        return restaurantdata.get(index).getName();
    }

    public Integer getDishesTimeRestaurant(int index,String namedish){
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

    public ArrayList<Integer> getLocationRestaurant(int index,int whichbranch){
        return restaurantdata.get(index).getLocation().get(whichbranch);
    }

    public Integer getLocationRestaurant(int index, int whichbranch, int whichelement){
        return restaurantdata.get(index).getLocation().get(whichbranch).get(whichelement);
    }
    public Integer getSizeofLocation(int index){
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


    public Character getFirstNameChar(int index){
        return restaurantdata.get(index).getName().charAt(0);
    }



}

