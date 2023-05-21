import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerE {
    public static void main(String[] args) {
        List<Double> sciGrades = Arrays.asList(2.5, 4.98, 3.76);
        List<Double> mathGrades = Arrays.asList(4.6, 3.2, 1.9);

        BiConsumer<Double, Double> printProm = (a,b) -> System.out.println("Prom: " + ((a+b)/2));
        for (int i =0; i < sciGrades.size(); i++){
            Double sci = sciGrades.get(i);
            Double math = mathGrades.get(i);
            printProm.accept(sci, math);
        }
    }
}
