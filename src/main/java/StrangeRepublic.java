import java.util.Random;

public class StrangeRepublic {
    public static void makePeaceNotWar(){
        System.out.println("Peace!");
        System.out.println("We want to be friends with you!");
        String number = String.valueOf(new Random().nextInt(1000000));
        System.out.println("Call us! Our number: "+number);
    }
}
