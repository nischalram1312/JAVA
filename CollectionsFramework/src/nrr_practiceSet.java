import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class nrr_practiceSet {
    public static void main(String[] args) {
        ArrayList L1 = new ArrayList();
        L1.add(00);
        L1.add(22);
        L1.add(21);
        L1.add(33);
        L1.add(55);
        for(Object o : L1){
            System.out.println(o);
        }
        System.out.println("__________________________________");

        HashSet<Integer> s = new HashSet<>();
        s.add(6);
        s.add(4);
        s.add(8);
        s.add(8);
        s.add(4);
        s.add(99);
        s.add(77);
        System.out.println(s);
    }
}
