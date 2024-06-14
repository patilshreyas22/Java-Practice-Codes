import java.util.Scanner;

 class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Composite numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (isComposite(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    // Method to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not composite numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // num has a divisor other than 1 and itself
            }
        }
        return false; // num is a prime number
    }
}

