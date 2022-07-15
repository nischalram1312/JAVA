package Nischal.company;

import java.util.ArrayList;
import java.util.Scanner;
class MyGeneric<T1>{
    int val;
    private T1 t1;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Srting 1");
        arrayList.add(54);
        arrayList.add(643);
        arrayList.add(new Scanner(System.in));
        //type casting
        int a = (int) arrayList.get(2);
        System.out.println(a);

        MyGeneric<String> g1 = new MyGeneric(23,"My String");
        String str = g1.getT1();
        System.out.println(str);
    }
}
