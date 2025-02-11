public class palindrome {
    public static boolean isPalindrome(String word) {
        int init = 0;
        int end = word.length() - 1;

        while(init < end) {
            if (word.charAt(init) != word.charAt(end)) {
                return false;
            }
            init++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " not palindrome.");
        }
    }
}
