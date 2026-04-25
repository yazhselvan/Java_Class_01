package CollectionsDemo;

import java.util.*;

public class SetDemo {
    /*
    Set

    HashSet
    LinkedHashSet
    TreeSet

    1. no Duplicates --> allows only unique elements

    2. HashSet and Linked Hashset are heterogenous --> it can hold different data types

    HashSet
    1. Default capacity - 16
    2. Fill ratio - 75%
    3. No Insertion order

    LinkedHashSet
    1. maintains insertion order

    TreeSet
    1. sorted -->ascending by default
    2. Not Heterogeneous --> since it has sorting property
     */
    static void main() {
        Set newSet = new HashSet();
        newSet.add("A");
        newSet.add("A");
        newSet.add("C");
        newSet.add("E");
        newSet.add("D");
        newSet.add(1);

        Iterator SetIterator = newSet.iterator();

        while(SetIterator.hasNext()){
            System.out.println(SetIterator.next());
        }

        System.out.println(newSet);

        LinkedHashSet<Integer> newLinkedSet =  new LinkedHashSet<Integer>();
        newLinkedSet.add(10);
        newLinkedSet.add(3);
        newLinkedSet.add(2);
        newLinkedSet.add(10);

        Iterator linkedSetIterator = newLinkedSet.iterator();

        while(linkedSetIterator.hasNext()){
            System.out.println(linkedSetIterator.next());
        }

        System.out.println(newLinkedSet);

        System.out.println("------------------------");

        TreeSet<Integer> newTreeSet = new TreeSet<>();
        newTreeSet.add(10);
        newTreeSet.add(5);
        newTreeSet.add(3);
        newTreeSet.add(20);
        newTreeSet.add(10);
        newTreeSet.add(21);
        newTreeSet.add(35);

        System.out.println(newTreeSet);
        newTreeSet.remove(3);
        System.out.println(newTreeSet.headSet(20));
        System.out.println(newTreeSet.tailSet(20));

        System.out.println(newTreeSet.higher(10));
        System.out.println(newTreeSet.lower(20));
        System.out.println(newTreeSet.pollFirst());
        System.out.println(newTreeSet.pollLast());
        System.out.println(newTreeSet);

        Iterator treeSetIterator = newTreeSet.descendingIterator();
        while(treeSetIterator.hasNext()){
            System.out.println(treeSetIterator.next());
        }

        /*
        occurance of every character in a string;
        String name = "yazhmozhiselvan";
        y = 1
        a = 2
        z = 2
         */

    }
}
