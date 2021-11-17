package software;

import java.util.Arrays;

public class Cinema {
    private String name;
    private CinemaRoom[] arr = new CinemaRoom[10];
    int counter = 0;

    public Cinema(String namei){
        name = namei;
    }

    public void addCinemaRoom(int capacity, String movie){
            CinemaRoom idk = new CinemaRoom(counter+1,capacity,movie);
            arr[counter] = idk;
            counter++;
    }

    public void addVisitors(int visitors, int id){
        arr[id].addVisitors(visitors);
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i <= 3; i++) {
           output += arr[i].toString() + " ";
        }
        output = "Kino " + name + "\n" + output ;
        return output;
    }
}
