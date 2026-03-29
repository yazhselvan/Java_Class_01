package Inheritance.MultilevelInheriance;


/*
Calc --> Parent class
SciCalc --> derived class --> derived from Calc.java
AdvCalc --> derived class --> derived from SciCalc. java

This achieves Multilevel Inheritance

 */
public class CalcUser {
    public static void main(String[] args) {
        AdvCalc cal = new AdvCalc();
        float div = cal.div(4,2);
        int sum = cal.add(2,3);
        int mul = cal.mul(2,4);
        System.out.println(sum + " " + div + " " + mul);


    }
}
