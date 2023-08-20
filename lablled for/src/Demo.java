public class Demo {
    public static void main(String[] args) {
        int i = 1;
        scot:while (i <= 5) {
            int n = 1;
            greece:while (n<= 5) {
                System.out.println("KodNest ");
                n++;
                break scot;
            }
            i++;
        }

    }
}