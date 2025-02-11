public class Primes {
    public static boolean isPrimes(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        int num = 7;
        if (isPrimes(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " not prime");
        }
    }
}
