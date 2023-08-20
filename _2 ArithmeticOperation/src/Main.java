import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers to be subtracted");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        System.out.println(subtractNumbers(num1,num2));
        System.out.println("enter 2 numbers to be subtracted");
        num1= scan.nextInt();
        num2= scan.nextInt();
        System.out.println(multiplyNumbers(num1,num2));

        }
    public static int subtractNumbers(int num1, int num2){
        return num1-num2;
    }
    public static int multiplyNumbers(int num1, int num2){
        return num1*num2;
    }
    }

