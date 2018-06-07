import java.util.ArrayList;

public class ArrayListIndex {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        int index = number.indexOf(20);
        System.out.println("The Index of 20 is: "+index);
    }
}
