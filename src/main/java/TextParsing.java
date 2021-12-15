import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParsing {
    public static void main(String[] args) throws Exception{
        TextParsing textParsing = new TextParsing();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("입력하세요 : ");
//        String inputString = scanner.nextLine();

        String inputString = "//;\n1;2;3";

        if(inputString == null || inputString.isEmpty()){
            new RuntimeException("입력된 값이 없습니다.");
        }

        textParsing.stringParseMain(inputString);
    }

    public void stringParseMain(String inputString) throws Exception{

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(inputString);

        List<String> numbers = new ArrayList<>();

        if(m.find()){
            String customToken = m.group(1);
            numbers = Arrays.asList(m.group(2).split(customToken));
        }else{
            numbers = parseStringWithTokenizer(inputString, ",|:");
        }

        System.out.println("합계 : "  + getSum(numbers));
    }

    public int getSum(List<String> numbers) throws Exception{
        int result = 0;
        for(String number : numbers){
            if(Integer.parseInt(number) < 0 )
                new RuntimeException("음수입니다.");
            result += Integer.parseInt(number);
        }
        return result;
    }

    public List<String> parseStringWithTokenizer(String inputString, String token) {
        return Arrays.asList(inputString.split(token));
    }
}
