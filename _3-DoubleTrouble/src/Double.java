import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to be Doubled");
        int num= scanner.nextInt();
        System.out.println(doubleTheNumber(num));

    }
    public static int doubleTheNumber(int num){
        return num*2;
    }
}

