import java.lang.reflect.Constructor;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws Exception {
//        Faisal faisal1=Faisal.getFaisal();
//        Faisal faisal2= Faisal.getFaisal();
//        System.out.println("the hash code of faisal 1 is "+faisal1);
//        System.out.println("the hash code of faisal 2 is "+ faisal2);
//        System.out.println("the hash code of shivam is"+ Shivam.getShivam());
//        System.out.println("the hash code of shivam is"+ Shivam.getShivam());
        Faisal faisal = Faisal.getFaisal();
        System.out.println(faisal.hashCode());
        Constructor<Faisal> constructor=Faisal.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Faisal f2= constructor.newInstance();

        System.out.println(f2.hashCode());



    }
}
