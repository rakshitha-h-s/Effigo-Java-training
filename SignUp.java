import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome let's sign you up."); 
        System.out.println("What is your first name?");
        String finame=scan.nextLine();
        System.out.println("What is your last name?");
        String laname=scan.nextLine();
        System.out.println("How old are you?");
        int age=scan.nextInt();
        System.out.println("Make a username");  
        scan.nextLine();
        String usern=scan.nextLine();
        System.out.println("What city do you live in?");
        String city=scan.nextLine();
        System.out.println("What country is that?");
        String count=scan.nextLine();
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: "+finame);
        System.out.println("\tLast Name: "+laname);
        System.out.println("\tAge: "+age);
        System.out.println("\tUsername: "+usern);
        System.out.println("\tCity:"+city);
        System.out.println("\tCountry: "+count);
        scan.close();
    }
}
