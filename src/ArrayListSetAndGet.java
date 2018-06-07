import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSetAndGet {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("before set: " + set);
        set.set(1, 100);
        System.out.println("After set: ");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());//after set
        }
        System.out.println();
        System.out.println("after get :");
        /*get method*/
       int getNumber = set.get(2);
        System.out.println(" "+getNumber);
    }
}
