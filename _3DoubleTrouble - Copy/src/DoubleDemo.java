import java.util.Scanner;

public class DoubleDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println(doubleTheNumber( num));

    }
    public static int doubleTheNumber(int num){
        return num*2;
    }
}
