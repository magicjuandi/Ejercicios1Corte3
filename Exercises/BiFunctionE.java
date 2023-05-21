import java.util.function.BiFunction;

public class BiFunctionE {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> sumWord = (a, b) -> a.length() + b; 
        Integer result = sumWord.apply("Hey", 2);
        System.out.println("Result: "+result);
    }
}