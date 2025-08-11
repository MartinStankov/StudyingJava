public class isPalindrome001 {
    public static void main(String[] args) {
        isPalindrome001 isNumberPalindrome = new isPalindrome001();
        System.out.println(isNumberPalindrome.isPalindrome(121));
        System.out.println(isNumberPalindrome.isPalindrome(15651));
        System.out.println(isNumberPalindrome.isPalindrome(15222651));
    }

    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        String stringNumber = String.valueOf(x);
        int numberLength = stringNumber.length();

        for (int i = 0; i < numberLength/2; i++){
            if (stringNumber.charAt(i) != stringNumber.charAt(numberLength -i -1)) {
                return false;
            }
        }

        return true;

    }
}
