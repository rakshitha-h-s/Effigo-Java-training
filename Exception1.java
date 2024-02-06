import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int rating=sc.nextInt();
        SetNameAndRating s=new SetNameAndRating();
        try{
            if(name.isBlank() || name==null || rating>5 || rating<0){
                throw new IllegalArgumentException();
            }
            
            s.setName(name);
            s.setRating(rating);
        }
        catch(IllegalArgumentException e)
        {
                System.out.println("IllegalArgument");
                System.exit(0);
        }
        finally{
            System.out.println(s.getName());
            System.out.println(s.getRating());
        }
    }
}
class SetNameAndRating{
    private String name;
    private int rating;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}
