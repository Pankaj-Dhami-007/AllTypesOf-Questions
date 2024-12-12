public class Program1 {
    static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static void checkPrimeNo(num){
        int count = 0;

        for (int i = 1; i <= 50; i++) {
            boolean isPrime = true;

            // Check if the number is prime
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println(count);
    }
    public static void main(String[] args) {
        int count = 0;
        for(int i =1; i <= 50; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;

            }
        }
        System.out.println();
        System.out.println(count);
    }
}
