import java.util.Scanner;

public class demo {
    public static void checkDiscount(double purchaseAmount) {
        if (purchaseAmount>=100){
            System.out.println("Discount is Applicable");
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Amount");
        double purchaseAmount=scanner.nextDouble();
        checkDiscount(purchaseAmount);
//code here

    }

}
