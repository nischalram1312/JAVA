package Nischal.company;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is :"+id);
        System.out.println("My name is :"+name);
    }
    public int getSalary(){
        System.out.print("My salary is :");
        return salary;
    }
}
public class nrr__custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
//         creating a new object or instantiating a new employee object
        Employee Nischal = new Employee();
        Employee Ram = new Employee();
//        setting properties or attributes
        Nischal.id=99;
        Nischal.name="Travel Tales";
        Nischal.salary=30000;
        Ram.id=98;
        Ram.name="My adventure";
        Ram.salary=50000;

//        printing the properties or attributes
//        System.out.println(Nischal.id);
//        System.out.println(Nischal.name);
        Nischal.printDetails();

        int salary = Nischal.getSalary();
        System.out.println(salary);

        Ram.printDetails();

        int salary1 = Ram.getSalary();
        System.out.println(salary1);
//        custom print class


    }
}
