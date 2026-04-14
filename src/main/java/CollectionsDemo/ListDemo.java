package CollectionsDemo;

import java.util.*;

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
        6. insertion and deletion in Arraylist --> o(n)
        DSA - Data Structures and Algorithm
        o(1),               0(n),               0(n^2)
        |                                           |
        most efficient                          slowest

        //Testing Applcation
        Web Table or db table Values retrieval
         */

        /*
        LinkedList -->
        Properties
       1. Heterogenous in nature unless Generics are defined
        2. Generics will be defined in format  <>.
        3. will maintain insertion order
        4. it can hold duplicate values
        5. No RandomAccess --> Searching --> Slower
        6. Insertion or deletion --> this is faster than ArrayList

        LinkedList will not have indexing
        Node Formatting -->
        First Element --> Head
        Last Elment --> Tail

        Head, Pointer, Tail

        [1,2,3,4,5]

        Head -->1 --> pointer -->2 --> pointer --> 3 --- so on --> 5 --> tail
         */

        List<String> newList = new ArrayList<String>();
        List<String> newList2 = new ArrayList<String>();

        newList.add("HCL");
        newList.add("CG");
        newList.add("CTS");
        newList.add(3,"TCS");
        newList.add("TCS");
        newList.set(2,"CGI");
        System.out.println(newList.get(2));
        System.out.println(newList);
        newList2.addAll(newList);
        System.out.println("------/printing newList2/---------");
        System.out.println(newList2);

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

        Iterator <String> listIterator = newList.listIterator(); //Collections -> used for list or set

        System.out.println("-------- iteration using iterator ----------");
        while(listIterator.hasNext()){ //iterates unitil next value is present
            System.out.println(listIterator.next());
        }

        System.out.println("-------- iteration using iterator reverse----------");
        System.out.println(newList2);
        ListIterator <String> iterator2 = newList2.listIterator();
        while(iterator2.hasPrevious()){
            System.out.println(iterator2.previous());
        } //To be checked

        System.out.println("-------- LinkedList----------");
        List <String> linkedList = new LinkedList<String>();
        linkedList.add("John");
        linkedList.add("Priya");
        linkedList.add("Latha");
        linkedList.add("Priya");
        linkedList.remove("Latha");
        linkedList.addFirst("FirstName");
        linkedList.addLast("LastName");


        System.out.println(linkedList);





    }

}
