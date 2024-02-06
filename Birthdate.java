import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthdate {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        Scanner sc=new Scanner(System.in);
        String dob=sc.nextLine();
        LocalDate d1=LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        Period p=Period.between(d1,d);
        System.out.println(p.getYears());
        sc.close();
        

    }
}
