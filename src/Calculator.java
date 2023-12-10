import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception{
        String[] strings = Parser.readString(input);
        if (Parser.isArabic(strings[0]) ^ Parser.isArabic(strings[2]) || (strings.length != 3))
            throw new Exception();
        Converter.initialize();
        ReConverter.initialize();
        int operand1 = Parser.isArabic(strings[0]) ? Integer.valueOf(strings[0]) : Converter.convert(strings[0]);
        int operand2 = Parser.isArabic(strings[2]) ? Integer.valueOf(strings[2]) : Converter.convert(strings[2]);
        Integer result ;
        switch (strings[1]) {
            case "+": {
                result = operand1 + operand2;
                break;
            }
            case "-": {
                result = operand1 - operand2;
                break;
            }
            case "*": {
                result = operand1 * operand2;
                break;
            }
            case "/": {
                result = operand1 / operand2;
                break;
            }
            default:
                throw new Exception();
        }
        if (!(Parser.isArabic(strings[0]))) {
            String answer = ReConverter.reConvert(result);
            return answer;
        } else {
            return result.toString();
        }
    }
}

