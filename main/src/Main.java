import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter student First Name");
        String a=scan.next();
        System.out.println("value of a is "+a);
        System.out.println("Enter Student Last Name");
        String b=scan.next();
        System.out.println("value of b is "+b);
        System.out.println("Enter student age");
        int c=scan.nextInt();
        System.out.println("value of c is "+c);
        System.out.println("Enter student gender");
        String d=scan.next();
        System.out.println("value of d is "+d);
        System.out.println("Is student married  say true or false");
        boolean e=scan.nextBoolean();
        System.out.println("value of e is "+e);
        scan.nextLine();
        System.out.println("enter student branch");
        String f=scan.nextLine();
        System.out.println("value of f is "+f);
        System.out.println("Enter student height");
        float g=scan.nextFloat();
        System.out.println("value of g is"+g);
        System.out.println("Enter student weight");
        double h= scan.nextDouble();
        System.out.println("value of h is"+h);


    }
}