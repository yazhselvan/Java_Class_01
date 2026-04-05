package Exceptions;

//Exceptions
/*
Difference between Errors and Exceptions
Errors --> cannot be handled
virtualMachine error, memory space

Exceptions
1. Compile Time
SQLException
IOException


2. Run time --> 18/0 (Arithmetic Exception),
String s = null;
sout(s.length); --> (NullPointerException)
Status[] s = new array[5];
sout(s[5]); --> (ArrayOutofBoundIndex Exception)

3. Logical -->
return type --> 5 , but you get 4 or 3 --> Coding error --> Review the logic and restructure the logic

 Nullpointer, ArrayIndexOutOfBound, Arithemetic --> sub classes of Exception
 Exceptions --> it is the parent of all types of exceptions

 For Try catch
 1. this to handle your run time exception
 2. If you had known the specific exception, you can use that type of exception inside catch block
 For example --> Predicting Arithmetic Exception and using ArithmeticException inside catch
 3. IF you predict unknown exception, you can use the parent class  which is Exception
 4. Exception catch --> Parent class should always be at the end of all catch blocks.
 */



public class ExceptionsDemo {
    static void main() {
        int i = 18;
        int j = 0;
        String[] arr = new String[5];

        try{
            int k = i/j;

            System.out.println(arr[1]);
            System.out.println(arr[5]);

        }

        catch (ArithmeticException e){
            System.out.println("Please do not divide any number by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please check your boundary conditions") ;
        }
        catch (Exception e){
            System.out.println(" UnKnown error" + e);
        }

        System.out.println(j);
    }
}
