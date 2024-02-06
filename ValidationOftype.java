import java.util.Scanner;

public class ValidationOftype {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public ValidationOftype(String title, String publisher, int issueNumber, int publicationYear)
    {
    setTitle(title);
    setPublisher(publisher);
    setIssueNumber(issueNumber);
    setPublicationYear(publicationYear);
    }
    public static void main(String[] args) {
         ValidationOftype e1= new ValidationOftype("Magazine 1", "Publisher 1", 1, 2020);
        System.out.println(e1.getTitle());
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the title name");
        e1.setTitle(nameValidate(sc));
        System.out.println("enter the publisher name");
        e1.setPublisher(nameValidate(sc));
        System.out.println("Please enter the issuenumber");
        e1.setIssueNumber(numberValidate(sc));
        System.out.println("enter the publication year");
        e1.setPublicationYear(numberValidate(sc));
        sc.close();
    }
    public static String nameValidate(Scanner sc)
    {
        
         while(true){  
            String name=sc.next();
            if(name.isBlank() || name==null || name.matches("0-9"))
            {
                continue;
            }else{
            return name;
         }
    }
}
    public static int numberValidate(Scanner sc)
    {
        while(true){
            //int num=sc.nextInt();
            if(!sc.hasNextInt())
            {
                continue;
            }else{
            return sc.nextInt();
            }
        }
    }
    

}
