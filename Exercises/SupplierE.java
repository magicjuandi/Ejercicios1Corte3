import java.util.Random;
import java.util.function.Supplier;

public class SupplierE {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(100);
        int randomNumber = random.get();
        System.out.println("Random number: " + randomNumber);
    }
}
