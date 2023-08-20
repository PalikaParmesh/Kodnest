import java.util.Scanner;

public class ScoreApp{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Score");
        int score = scanner.nextInt();
        Demo d=new Demo();
        d.GiveGrade(score);
    }
}