package org.example;

/*
Static --> any object or variable --> this belongs to class
 */

class EmployeeDetails{


    static String CompanyName;
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public static String getCompanyName()
    {
        //non static varaible cannot be used inside a static method
        return CompanyName;

    }


}
public class StaticKeyWord {
    public static void main(String[] args) {

        EmployeeDetails.CompanyName = "HCL";
        //Object creation is not required if a variable is static
        //Syntax:  Classname.VariableName
        EmployeeDetails ed = new EmployeeDetails();
        //Name is not static variable. object creation is required here.
        ed.setName("Jenifer");
        EmployeeDetails ed1 = new EmployeeDetails();
        ed1.setName("John");
        System.out.println(EmployeeDetails.getCompanyName());
        //Object creation is not required if a method is static
        //Syntax = for method access --> Classname.MethodName




    }
}
