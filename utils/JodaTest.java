import java.util.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTest {
  public static void main(String[] args) throws Exception {
    String pattern = args[0];
    String dText = args[1];
    DateTimeFormatter format =
        DateTimeFormat.forPattern(pattern)
            .withLocale(Locale.US);
    System.out.println(format.parseDateTime(dText));
  }
}
