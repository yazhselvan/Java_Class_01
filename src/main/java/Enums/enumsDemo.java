package Enums;

//OOPS
/*
you can explain OOPS now
Classes and objects
Abstraction
Inheritance
Interface
Polymorphism - Method overloading and Method OVerriding
Constructors
Encapsulation

Why object creation for class that implements interface is not recommended?
 */

//Enums have skeleton of  a class

enum Status{
    Running, Failed, Passed, Pending;
    //Named constants or objects
}
public class enumsDemo {
    public static void main() {
        Status[] ss = Status.values();
//        System.out.println(s.ordinal()); //ordinal gets the index of the named constants
//        System.out.println(s[1]);
        //if all values needs to be printed, for Each loop
        //for(int i = 0; i<ss.length; i++)
        for(Status s : ss){ //for every elements inside array
            //for every objects of s in Array ss
            System.out.println(s +" :" +s.ordinal());

        }
    }





}
