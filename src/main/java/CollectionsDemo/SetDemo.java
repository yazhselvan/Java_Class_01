package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

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
    }
}
