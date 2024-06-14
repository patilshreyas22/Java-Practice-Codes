import java.util.Scanner;

 class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Initialize the array with the specified size
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Check and print prime numbers in the array
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num has a divisor other than 1 and itself
            }
        }
        return true; // num is a prime number
    }
}

