package day3;

public class Visits {
    static final int MAX_VISITS = 3;
    static int visits = 0;

    public static void registerVisit(){
        visits++;
        var text = "Визит " + (visits);
        System.out.println(text +" из "+ (Visits.MAX_VISITS));
    }

    public static void main(String[] args){
        registerVisit();
        registerVisit();
        registerVisit();

        int visits = 100;
        System.out.println(visits + " " + (Visits.visits));
//        MAX_VISITS = 5;
//        var empty;
//        registerVisit(text);
    }
}
