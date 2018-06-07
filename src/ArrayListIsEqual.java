import java.util.ArrayList;

public class ArrayListIsEqual {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("number1 : "+number1);

        number2.add(100);
        number2.add(200);
        number2.add(300);
        number2.add(400);
        System.out.println("number1 : " +number2);

        number3.addAll(number1);
        System.out.println("number3 : "+number3);

        boolean equal = number1.equals(number3);//check equality
        System.out.println(equal);
    }
}
