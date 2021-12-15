import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestParsingTest {
    TextParsing textParsing = new TextParsing();

    @Test
    void parseStringWithTokenizer(){
        Assertions.assertEquals(1, textParsing.parseStringWithTokenizer("0", ",|:").size());
        Assertions.assertEquals(3, textParsing.parseStringWithTokenizer("1,2,3", ",|:").size() );
        Assertions.assertEquals(3, textParsing.parseStringWithTokenizer("1,2:3", ",|:").size() );
    }

    @Test
    void getCustomToken(){
//        Assertions.assertEquals("a", textParsing.getCustomToken("//a\n"));
//        Assertions.assertEquals("b", textParsing.getCustomToken("//b\n"));
//        Assertions.assertEquals(";", textParsing.getCustomToken("//;\n"));
    }

    @Test
    void getSum() throws Exception{
       //textParsing.stringParseMain();
    }
}
