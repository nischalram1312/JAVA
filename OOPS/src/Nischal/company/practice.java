package Nischal.company;
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class practice {
    public static void main(String[] args) {
        Employee1 Nischal =new Employee1();
        Nischal.setName("Raghu Ram");
        System.out.println(Nischal.getName());
        Nischal.salary=30000;
        System.out.println(Nischal.getSalary());
    }
}
