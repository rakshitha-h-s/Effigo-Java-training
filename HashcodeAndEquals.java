import java.util.Objects;

public class HashcodeAndEquals {
    private String name;
    private int id;
    public HashcodeAndEquals(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
     public int hashCode() {
        return Objects.hash(name, id);
    }
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HashcodeAndEquals)) {
            return false;
        }
        HashcodeAndEquals student = (HashcodeAndEquals) o;
        return id == student.id && Objects.equals(name, student.name);
    }
    public static void main(String[] args) {
        HashcodeAndEquals obj1=new HashcodeAndEquals("Effigo",1);
        HashcodeAndEquals obj2=obj1;
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
