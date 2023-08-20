import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two Numbers to Subtract");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println(subtractNumbers(num1,num2));
        System.out.println("Enter two Numbers to Multiply");
         num1= scanner.nextInt();
         num2= scanner.nextInt();
        System.out.println(multiplyNumbers(num1,num2));
        System.out.println("Enter two Numbers to Divide");
         num1= scanner.nextInt();
         num2= scanner.nextInt();
        System.out.println(divideNumbers(num1,num2));
        System.out.println("Enter two Numbers to Find a Reminder");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        System.out.println(findRemainder(num1,num2));


    }
    public static int subtractNumbers(int num1, int num2){
        return num1-num2;
    }

    public static int multiplyNumbers(int num1, int num2){
        return num1*num2;
    }

    public static double divideNumbers(int num1, int num2){
        return num1/num2;
    }

    public static int findRemainder(int num1, int num2){
        return num1%num2;
    }
}
