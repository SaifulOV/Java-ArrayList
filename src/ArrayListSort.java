import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(-2);
        number.add(-452);
        number.add(34);
        number.add(65);
        number.add(52);
        number.add(4);
        number.add(8);
       for(int x : number){
           System.out.print(" "+x);
       }
        System.out.println();
       //sorting array

        Collections.sort(number);
        for(int x : number){
            System.out.print(" "+x);
        }
        //for reverse
        System.out.println();
        Collections.sort(number,Collections.reverseOrder());//this is the key works ****

        for(int x : number){
            System.out.print(" "+x);
        }
    }
}
