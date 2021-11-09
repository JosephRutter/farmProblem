import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static int chickenLeg() {
        System.out.println("enter the amount of chickens");
        return input.nextInt() * 2;
    }

    public static int cowLeg() {
        System.out.println("enter the amount of cows");
        return input.nextInt() * 4;
    }

    public static int pigLeg() {
        System.out.println("enter the amount of pigs");
        return input.nextInt() * 4;
    }

    public static void main(String[] args) {
        System.out.println("animal legs total(" + (chickenLeg() + cowLeg() + pigLeg()) + ")");
    }
}