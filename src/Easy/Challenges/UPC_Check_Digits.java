package Easy.Challenges;

public class UPC_Check_Digits {

    public static int checkDigit(int[] digits) {
        int evens = 0;
        int odds = 0;
        int digit = 0;
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                odds += digits[i];
            } else {
                evens += digits[i];
            }
        }
        odds *= 3;
        digit = evens + odds;
        digit %= 10;
        if (digit != 0) {
            digit = 10 - digit;
            return digit;
        } else {
            return 0;
        }
    }

    public static int[] convert(String[] digits) {
        int[] newDigits = new int[11];
        int check =0;
        int length = newDigits.length - digits.length;
        if (length!= 0) {
            for (int i = 0; i < length; i++) {
                if (length != 0) {
                    newDigits[i] = 0;
                }
                check++;
            }
        }
        for(int i=0; i< newDigits.length-check; i++) {
            int temp = Integer.parseInt(digits[i]);
            newDigits[check +i] = temp;
        }
        return newDigits;
    }

    public static void main (String[] args){
        String code = "1234567";
        String[] digits = code.split("");
        int codeArray[] = convert(digits);
        System.out.println("Final Digit: " + checkDigit(codeArray));
    }
}
