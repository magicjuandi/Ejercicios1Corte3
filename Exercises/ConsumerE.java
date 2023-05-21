import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerE {
    public static void main(String[] args) {
        List<Number> grades = Arrays.asList(4.5, 3.8, 2.6, 5);
        Consumer<Number> printGrades = element -> System.out.println(element);
        grades.forEach(printGrades);
        
    }
}
