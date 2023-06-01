import com.qwfys.sample.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author liuwenke
 * @since 0.0.1
 */
public class MainTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        System.out.println(">>>>>>>>>>>>>>");
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
        System.out.println("<<<<<<<<<<<<<<");
    }
}
