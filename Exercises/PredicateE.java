import java.util.function.Predicate;

public class PredicateE {
    public static void main(String[] args) {
        Predicate<String> isLarge = word -> word.length() > 4;
        String words = "Ayuda";
        boolean result = isLarge.test(words);
        System.out.println("Is 5 or more characters? :" + result);
    }
}
