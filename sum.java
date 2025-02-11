public class sum {

    public static int showSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
            return sum;
    }

    public static void main (String[] var0) {
        int output = showSum(123);
        
        System.out.println("Output: "+ output);
    }
}
