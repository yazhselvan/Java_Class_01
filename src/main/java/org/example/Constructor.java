package org.example;

class Employee{

    String EmployeeName; //Instance variable -- variables declared inside class or class level
    int EmpID;

//    Employee(){}
    //Constructor can be overloaded
    Employee(){
        this("Jenifer", 1002); //this calls the constructor within the same class
    }

    Employee(String EmployeeName, int EmpID){ //Local Variables
        this.EmployeeName = EmployeeName;
        this.EmpID = EmpID;
        System.out.println(EmployeeName + " " + EmpID);
    }


}

/*
Default
No Argument
Parametrized
 */

//Default Construction
// No Argument
//Parametrized
//Usage of this keyword

//Rules
/*
1. The name should be same as Class name --> Syntax rule
2. Constructor cannot have a return type
3. Constructor cannot be abstract, final, static
 */

public class Constructor {

    public static void main(String[] args) {
//        Employee emp = new Employee("John", 1001);
        Employee emp1 = new Employee();

    }

}
