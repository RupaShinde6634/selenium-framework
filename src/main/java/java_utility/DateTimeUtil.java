package java_utility;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    // 👇 Private constructor to prevent instantiation
    private DateTimeUtil() {
        throw new UnsupportedOperationException("Utility class - Do not instantiate");
    }

    // ✅ Get current date in yyyy-MM-dd format
    public static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDateTime.now().format(formatter);
    }

    // ✅ Get current time in HH:mm:ss format
    public static String getCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    // ✅ Get full date-time in custom format
    public static String getFormattedDateTime(String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.now().format(formatter);
    }

    // ✅ Get timestamp like "20250405_163020"
    public static String getTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return LocalDateTime.now().format(formatter);
    }
}
