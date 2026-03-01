package org.example;

public class Methods {

    //set of operations to be performed
    //method with no return types - void Method_name()
    //Method_name(arguments)
    //methods with return types

    int add(int a, int b){
        return a+b;
    }

    //Method Overloading - having same method name with different set of parameters
    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        int sum = methods.add(2,3, 5);
        System.out.println(sum);
    }
}
