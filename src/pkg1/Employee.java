package pkg1;

public class Employee {

    String name;
    String ID;
    Double salary;

    public void employeeBonus() {
        System.out.println(name + " bonus is " + "$" + salary*0.2);
    }

}
