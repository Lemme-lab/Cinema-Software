package software;

public class CinemaRoom {
    private int id;
    private int capacity;
    private int visitors;
    private String movie;


    public CinemaRoom(int idi, int capacityi, String moviei){
        id = idi;
        capacity = capacityi;
        movie = moviei;
        visitors = 0;
    }

    @Override
    public String toString() {
        return "Kinosaal " + this.id +":" + movie + "," + capacity + "/" + visitors;
    }

    public int addVisitors(int number){
        int output = 0;
        if(visitors + number <= capacity) {
            visitors += number;
            output = 0;
        }else if(visitors + number >= capacity){
            visitors = (-1) * ((visitors+number)-capacity);
        }
        System.out.println(output);
        return output;
    }

    public int getVisitors() {
        return visitors;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getMovie() {
        return movie;
    }

    public int getId() {
        return id;
    }
}
