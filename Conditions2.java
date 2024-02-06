import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            System.out.println("the character is a");
            break;
            case 'b':
            System.out.println("the character is b");
            case 'c':
            System.out.println("the character is c");
            default:
            System.out.println("enter char between a,b,c");
        }
        sc.close();
    }
}
