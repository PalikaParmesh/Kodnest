public class Demo {
    public static void main(String[] args) {
        greet();
        int a=5,b=2;
        int res=add(a,b);
        System.out.println("addition is\n "+res);
        boolean res1= check(a,b);
        System.out.println("greater num "+res1);
        int res2=add(a,b)/2;
        System.out.println("average is "+res2);
        int res3=mod(a,b);
        System.out.println("mod of two "+res3);
    }
    public static void greet()
    {
        System.out.println("Hii Barbie...");
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static boolean check(int a,int b){
        return a>b;
    }
    public static int mod(int a,int b)
    {
        return a%b;
    }
}
