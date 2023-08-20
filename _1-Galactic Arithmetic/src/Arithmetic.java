import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        long num1= scanner.nextLong();
        long num2= scanner.nextLong();
        System.out.println(galacticAddition(num1,num2));

    }
    public static long galacticAddition(long num1, long num2){
        return num1+num2;
    }
}
