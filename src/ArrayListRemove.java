import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size : " + number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(0, 40);

        for (int x : number
                ) {
            System.out.print(" " + x);
        }
        System.out.println();
        //remove data
        number.remove(2); // remove by indexing
        System.out.println("After remove data");
        for (int x : number
                ) {
            System.out.print(" " + x);
        }

        System.out.println();

        number.removeAll(number);// remove All data from arrayList
        System.out.println("After remove All  data");
        for (int x : number
                ) {
            System.out.print(" " + x);
        }
        System.out.println();
        number.clear();  //using clear method.

        System.out.println("After Clear  data : "+number);


        //check is arrayList is empty or not .

        boolean check = number.isEmpty();
        System.out.println(check);
    }
}
