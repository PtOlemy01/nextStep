import java.util.*;

public class TextParsing {

    final String CUSTOM_TOKEN_PREFIX = "//";
    final String CUSTOM_TOKEN_SUFFIX = "\n";

    public void stringParseMain(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        String inputString = scanner.next();

        List<String> numbers = parseStringWithTokenizer(inputString, ",|:|" + getCustomToken(inputString));

        System.out.println("합계 : "  + getSum(numbers));
    }

    public int getSum(List<String> numbers) {
        int result = 0;
        for(String number : numbers){
            result += Integer.parseInt(number);
        }
        return result;
    }

    public String getCustomToken(String inputString) {
        String result = "";
        if(inputString.contains(CUSTOM_TOKEN_PREFIX) && inputString.contains(CUSTOM_TOKEN_SUFFIX)){
            result = (inputString.split(CUSTOM_TOKEN_SUFFIX)[0]).split(CUSTOM_TOKEN_PREFIX)[1];
        }
        return result;
    }

    public List<String> parseStringWithTokenizer(String inputString, String token) {
        return Arrays.asList(inputString.split(token));
    }
}
