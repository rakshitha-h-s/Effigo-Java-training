import java.util.ArrayList;
import java.util.Arrays;
public class Loops {
    public static void main(String[] args) {
        for(int i=1;i<21;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
        int j=1;
        while(j<21)
        {
            if(j%2==0)
                System.out.println(j);
            j++;
        }
        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(23,45,23,67,65));
        for(Object b:al)
        {
            System.out.println(b);
        }
    }
}
