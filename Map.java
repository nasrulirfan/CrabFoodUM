import java.io.IOException;
import java.util.ArrayList;

public class Map {
    private Character[][] map = new Character[5][5];
    private CrabProcess data = new CrabProcess();

    void makeinitialmap() throws IOException {
        data.readRestaurant("F:\\IdeaProjects\\CrabFood\\InputRestaurant.txt");
        initial();
        int k = 0;
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                for (int a = 0; a < 3; a++){
                    for (int b = 0; b < 3; b++){
                        if (i == data.getLocationRestaurant(a,b,k) && j == data.getLocationRestaurant(a,b,k+1)){
                            map[i][j] = data.getFirstNameChar(a);
                        }
                    }
                }

                }
                    }

                }

                private void initial(){
        for (int i = 0; i< map.length; i++){
            for (int j =0; j<map.length; j++){
                map[i][j] = '0';
            }
        }
                }




        public void add(int x, int y,Character firstrestaurantchar){
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                if (i == x && j == y){
                    map[i][j] = firstrestaurantchar;
                }
            }
        }
    }

        void printmap(){
            for (Character[] characters : map) {
                for (int j = 0; j < map.length; j++) {
                    System.out.print(characters[j]);
                }
                System.out.println();
            }
        }

        public void getelementofindex(int x,int y){
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                if (i == x && j == y){
                    System.out.println(map[i][j]);
                }
            }
        }

        }
    }
