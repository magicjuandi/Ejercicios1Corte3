import java.util.Arrays;
import java.util.List;

public class SortedE {
    public static void main(String[] args) {
        List<String> clients = Arrays.asList("Armando", "Carlos", "Marca Antonia", "Dahyanna", "Gisseellee");

        clients.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
