import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class a_11_7 {

    /*
    7. Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers
    that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if one list contains
    the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values [–5, 15, 2, –1, 7, 15, 36],
    your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.
     */

    public static void main(String[] args) {

        List<Integer> oneList = new LinkedList<>();
        List<Integer> otherList = new LinkedList<>();

        oneList.add(0,3);
        oneList.add(1,7);
        oneList.add(2,3);
        oneList.add(3,-1);
        oneList.add(4,2);
        oneList.add(5,3);
        oneList.add(6,7);
        oneList.add(7,2);
        oneList.add(8,15);
        oneList.add(9,15);

        otherList.add(0,-5);
        otherList.add(1,15);
        otherList.add(2,2);
        otherList.add(3,-1);
        otherList.add(4,7);
        otherList.add(5,15);
        otherList.add(6,36);

        System.out.println("Number of elements that occur in both lists: \n" + countCommon(oneList, otherList));
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {

        Set<Integer> testSet1 = new HashSet<>(list1);
        Set<Integer> testSet2 = new HashSet<>(list2);

        // https://docs.oracle.com/javase/7/docs/api/java/util/Set.html#retainAll(java.util.Collection)
        // Retains only the elements in this set that are contained in the specified collection (optional operation).
        // In other words, removes from this set all of its elements that are not contained in the specified collection.
        // If the specified collection is also a set,
        // this operation effectively modifies this set so that its value is the intersection of the two sets.
        testSet1.retainAll(testSet2);

        return testSet1.size();
    }
}
