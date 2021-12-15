import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestParsingTest {


    @Test
    void parseStringWithTokenizer(){
        TextParsing textParsing = new TextParsing();

        Assertions.assertEquals(1, textParsing.parseStringWithTokenizer("0", ",|:").size());
        Assertions.assertEquals(3, textParsing.parseStringWithTokenizer("1,2,3", ",|:").size() );
        Assertions.assertEquals(3, textParsing.parseStringWithTokenizer("1,2:3", ",|:").size() );
    }

    @Test
    void getCustomToken(){
        TextParsing textParsing = new TextParsing();
        Assertions.assertEquals("a", textParsing.getCustomToken("//a\n"));
    }
}
