import javax.sound.sampled.Control;
import java.util.Scanner;

public class ControlConstructs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int marks = scanner.nextInt();
        System.out.println("WELCOME TO COLLEGE");
          Control(marks);
    }

    public static void Control(int marks) {
        if (marks >= 80 ) {
            System.out.println("WELCOME TO TECH CLUB");
        }
    }
}