import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestParsingTest {


    @Test
    void parseStringWithTokenizer(){
        TextParsing textParsing = new TextParsing();

        Assertions.assertEquals(textParsing.parseStringWithTokenizer("0", ",|:").size() , 1);
        Assertions.assertEquals(textParsing.parseStringWithTokenizer("1,2,3", ",|:").size() , 3);
        Assertions.assertEquals(textParsing.parseStringWithTokenizer("1,2:3", ",|:").size() , 3);
    }
}
