import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        System.out.println(numbers.get(0));
        System.out.println("\nIteration #1: ");
        for(int i=0;i < numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        System.out.println(("\nIteration #2:"));
        for(Integer value: numbers){
            System.out.println(value);
        }
        numbers.remove(numbers.size()-1);
    }
}
