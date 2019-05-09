import java.util.ArrayList;

public class Map {
    public Character[][] map = new Character[5][5];
    CrabProcess data = new CrabProcess();

    public void makeinitialmap(int x,int y){
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j< map.length; j++){
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

        public void printmap(){
        for(int i = 0; i< map.length; i++){
            for(int j = 0; j < map.length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println("");
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
