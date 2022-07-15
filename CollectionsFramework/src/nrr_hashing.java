import java.util.HashSet;

public class nrr_hashing {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(99,1.0f);
        h.add(6);
        h.add(7);
        h.add(9);
        h.add(10);
        System.out.println(h);
    }
}
