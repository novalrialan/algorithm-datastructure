import java.util.ArrayList;
import java.util.List;

public class SelectionfitythousandEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumber = new ArrayList<>();

        for (int i = 0; i <= 500; i++) {
            numbers.add(i);
            if (i % 2 == 0) {
                evenNumber.add(i);
            }
        }

        System.out.println(evenNumber);
    }
}
