package Nischal.company;
class Emp{
    private int id;
    private String name;
    public Emp(String n, int i){
        name = n;
        id = i;
//        System.out.format("%d %s \n",i,n);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class constructors {
    public static void main(String[] args) {
        Emp e = new Emp("Ram",13);
        Emp q = new Emp("Shyam", 12);
        Emp s = new Emp("Gam", 16);
        System.out.println(e.getId()+" "+e.getName());
        System.out.println(q.getId()+" "+q.getName());
        System.out.println(s.getId()+" "+s.getName());
    }
}
