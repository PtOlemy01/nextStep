package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup(){
        cal = new StringCalculator();
    }

    @Test
    public void add_null_또는_빈문자(){
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_숫자하나() throws Exception{
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception{
        assertEquals(3, cal.add("1,2"));
    }
}
