public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // powers of two are positive
        }
        return (n & (n - 1)) == 0; // in binary power of two has always 1 bit 
        // and we can sub by n-1 , we get 0
    }

    public static void main(String[] args) {
        int  n = 256;
        System.out.println(isPowerOfTwo(n));
    }
}
