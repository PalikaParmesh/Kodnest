import java.util.Scanner;

public class StringJoiner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two Strings");
        String str1= scanner.next();
        String str2= scanner.next();
        System.out.println(joinStrings(str1,str2));
    }
    public static String joinStrings(String str1, String str2){
        return (str1+","+str2);

    }
}
