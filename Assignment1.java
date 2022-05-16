import java.util.Scanner;

public class CodesCracker
{
    public static void main(String[] args)
    {
        String a, b,c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        a = scan.nextLine();
        System.out.print("Enter the Second String: ");
        b = scan.nextLine();
        c= a + "  " + "technologies" + "  " +b;
        System.out.println("concatenate string:" +c);


    }
}
