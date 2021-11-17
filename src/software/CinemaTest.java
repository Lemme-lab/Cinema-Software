package software;

public class CinemaTest {
    public static void main(String[] args) {
        Cinema Kino1 = new Cinema("Kino-Klagenfurt");
        Kino1.addCinemaRoom(75,"Pulp-Fiction");
        Kino1.addCinemaRoom(55,"Idk");
        Kino1.addCinemaRoom(85,"Red-Notice");
        Kino1.addCinemaRoom(70,"Goodfellas");
        Kino1.addCinemaRoom(90,"The-Room");
        System.out.println(Kino1);
        Kino1.addVisitors(50,0);
        Kino1.addVisitors(70,1);
        Kino1.addVisitors(150,2);
        System.out.println(Kino1);
    }
}
