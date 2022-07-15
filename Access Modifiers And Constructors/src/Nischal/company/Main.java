package Nischal.company;
class myEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name =n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
    }
}
public class Main {

    public static void main(String[] args) {
        myEmployee Nischal = new myEmployee();
//        Nischal.id=840;
//        Nischal.name="my travel tales"; throws an error because of private access modifier
        Nischal.setName("My adventure travel tales");
        System.out.println(Nischal.getName());
        Nischal.setId(99);
        System.out.println(Nischal.getId());
    }
}
