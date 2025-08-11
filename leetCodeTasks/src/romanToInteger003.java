import java.util.HashMap;
import java.util.Map;

public class romanToInteger003 {
    public static void main(String[] args){
        romanToInteger003 romanToInteger = new romanToInteger003();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> conversion = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++){
            int currentNumber = conversion.get(s.charAt(i));
            int nextNumber = 0;
            if (i + 1 < s.length()){
                nextNumber = conversion.get(s.charAt(i + 1));
            }

            if (currentNumber < nextNumber) {
                result -= currentNumber;
            } else {
                result += currentNumber;
            }
        }

        return result;
    }
}
