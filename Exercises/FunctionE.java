import java.util.function.Function;

public class FunctionE {
    public static void main(String[] args) {
        Function<String, Integer> wordLenght = str -> str.length();
        String input = "alo";
        Integer result = wordLenght.apply(input);
        System.out.println("How many characters? " + result);
    }
}