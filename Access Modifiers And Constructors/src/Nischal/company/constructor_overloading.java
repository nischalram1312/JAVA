package Nischal.company;
class Emp1{
    private int id;
    private String name;
    private int phoneNumber;
    public Emp1(String n, int i){
        name = n;
        id = i;
//        System.out.format("%d %s \n",i,n);
    }
    public Emp1(String n, int i, int a){
        name = n;
        id = i;
        phoneNumber = a;
//        System.out.format("%d %s \n",i,n);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        Emp1 e = new Emp1("Ram",13);
        Emp1 q = new Emp1("Ram",13,987362223);
        System.out.println(e.getId()+" "+e.getName());
        System.out.println(q.getId()+" "+q.getName()+" "+q.getPhoneNumber());


    }
}
