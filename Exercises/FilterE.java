import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterE {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(0.58, 1.2, 0.45, 0.000001);
        List<Double> filterNum = numbers.stream()
                                        .filter(number -> number > 1)
                                        .collect(Collectors.toList());
        System.out.println(filterNum);
    }
}
