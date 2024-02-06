public class Constructor {
    int a;
   
    public static void main(String[] args) {
        Constructor b=new Constructor();
        System.out.println(b.a);
    }
       public Constructor(){
            a=13;
            System.out.println("executes once the object is created");
       }
       {
        //static block
        System.out.println("executes first");
      }
    }

