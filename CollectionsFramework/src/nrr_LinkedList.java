import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class nrr_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(1);
        L2.add(2);
        L2.add(3);
        L1.add(00);
        L1.add(22);
        L1.add(21);
        L1.add(33);
        L2.add(3);
        L1.add(55);
        L1.remove(0);
        L1.add(2,99);//adds into index
        L1.addAll(0,L2);//append 2 arrays
        L1.set(1,33);
//        L1.clear();//clears all the elements in the arraylist
        System.out.println(L1.contains(7));
        System.out.println(L1.contains(2));
//        System.out.println(L1.indexOf());
        System.out.println(L1.indexOf(99));
        System.out.println(L1.indexOf(3));
        System.out.println(L1.lastIndexOf(3));

//        Collections.sort(L1);
////        for(Object a: L1){
////            System.out.println(a);
////        }
        for(int i=0; i<L1.size();i++){
            System.out.print(L1.get(i));
            System.out.print(", ");

        }
    }
}
