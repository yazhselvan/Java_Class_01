package Inheritance;

/*
Reuse of code
Mechanism : Parent - Child relationship
Types
1. Single --  A -> B
2. Multiple -- A,B,C -> D --> This is not possible via inheritance in Java but can be
achieved through interface
3. Multi level -- A->B ->C
4. Hierarchial -- A -> B, C, D
 */

//Method overriding
class Parent{
    void show(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{// Class name used after extends keyword is the parent class
    void show(){
        System.out.println("Child Class");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();

    }
}
