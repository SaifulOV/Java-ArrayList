import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size : " + number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(0, 40);
        System.out.println(number);   //method 1 for print number
        System.out.println("size : " + number.size());

        for (int x : number) {
            System.out.print(" " + x); //method 2 for print number
        }
        System.out.println();
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());//method 3 for print number
        }
    }
}
