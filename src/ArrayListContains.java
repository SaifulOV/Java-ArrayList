import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("ovi");
        name.add("Saiful Islam");
        name.add("Mehadi Hassan");
        name.add("Nusrat Rakhi");

        Iterator itr = name.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        System.out.println();
        boolean contain = name.contains("ovi");
        System.out.println("Is name Ovi is here: " + contain);
    }
}
