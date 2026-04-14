package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    /*
    super set of array
    int, String , float --> stores single values
    storing multiple values --> Arrays, Collections

    Arrays --> static --> memory allocation --> it will be static based on memory allocation

    List
        ArrayList
        LinkedList
    Set
        HashSet
        TreeSet
        LinkedHashSet

    Map // we can see this while we are seeing APIs --> Key value pair

     */
    static void main() {
//        int[] num = new int[5]; //example of an array
//        num[0] = 3;
//        num[1] = 4;
//        num[5] = 6;
//        System.out.println(num);

        /* Properties of ArrayList
        1. Heterogenous in nature unless Generics are defined
        2. Generics will be defined in format  <>.
        3. will maintain insertion order
        4. it can hold duplicate values
        5. RandomAccess --> Searching is faster in ArrayList --> o(1)
        6. insertion in Arraylist --> o(n)
        DSA - Data Structures and Algorithm
        o(1),               0(n),               0(n^2)
        |                                           |
        most efficient                          slowest

        //Testing Applcation
        Web Table or db table Values retrieval
         */

        List<String> newList = new ArrayList<String>();
        newList.add("HCL");
        newList.add("CG");
        newList.add("CTS");
        newList.add(3,"TCS");
        newList.add("TCS");
        newList.set(2,"CGI");
        System.out.println(newList.get(2));
        System.out.println(newList);

        System.out.println("--------forward iteration ----------");
        for(int i = 0; i<newList.size(); i++){
            System.out.println(newList.get(i));
        }
        System.out.println("--------reverse iteration ----------");
        for(int i = newList.size()-1; i>=0; i--){
            System.out.println(newList.get(i));
        }
        //ForEach Loop or enhanced for loop
        System.out.println("--------for each loop ----------");
        for(String company : newList){ //for every element inside the list
            System.out.println(company);
        }


    }

}
