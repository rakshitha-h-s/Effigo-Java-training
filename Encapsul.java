public class Encapsul {
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    private int a;
    private int b;
    public static void main(String[] args)
    {
        Encapsul e=new Encapsul();
         e.setA(2);
         int resA=e.getA();
         e.setB(3);
         int resB=e.getB();
         System.out.println("a:"+resA+"b:"+resB);
    }
    
}
