import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Distance and Time to Calculate the Distance");
        double speed = scanner.nextDouble();
        double time =scanner.nextDouble();
        JourneyCalculator journeyCalculator=new JourneyCalculator();
        double distance= journeyCalculator.calculateDistance(speed,time);
        System.out.println(distance);
        }
    }
