package Inheritance.MultilevelInheriance;

/*
Explain Super and Sub class --> Inheritance
Parent and Child Class

All normal class created in java are derived from "Object" class
 */



class A{
    public A(){

        System.out.println("in A");
    }

    public A(int a){
        this(); //this will call the other constructor inside the same class
        System.out.println("int A in");
    }
}

class B extends A{
    public B(){
        super(1);
        System.out.println("in B");
    }
}

//class C extends B,A{ // --> Multiple Inheritance  --> this will not be supported by Java
//
//    //why is Multiple inheriance not supported ?
//}
public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B();
    }
}
