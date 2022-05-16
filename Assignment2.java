java.util.Scanner;//write a program to accept a string as command line argument and the program should print a welcome message
public class Main {
    public static void main(String[] args)
    {
        String a,c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        c= "Welcome"+"  "+ a;

        System.out.println("" +c);
    }
}

