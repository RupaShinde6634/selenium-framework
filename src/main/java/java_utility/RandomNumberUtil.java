package java_utility;
import java.util.Random;

public class RandomNumberUtil {

    private static final Random random = new Random();

    // 👇 Private constructor to prevent object creation
    private RandomNumberUtil() {
        throw new UnsupportedOperationException("Utility class - Do not instantiate");
    }

    public static int getRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be <= max");
        }
        return random.nextInt((max - min) + 1) + min;
    }

    public static int getRandomNumber() {
        return random.nextInt();
    }
}
