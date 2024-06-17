import java.util.Scanner;

class code3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Populate the array with input values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Ensure the array has at least two elements
        if (size < 2) {
            System.out.println("Array needs at least two elements.");
            return;
        }

        // Initialize max and secondMax
        int max = arr[0];
        int secondMax = arr[0];

        // Traverse the array to find max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Initialize secondMax to something that is guaranteed to be less than max
        boolean foundSecondMax = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                secondMax = arr[i];
                foundSecondMax = true;
                break;
            }
        }

        // If no second max found, all elements are the same
        if (!foundSecondMax) {
            System.out.println("There is no second largest element.");
            return;
        }

        // Traverse the array to find secondMax
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        // Print the second largest element
        System.out.println("Second largest element: " + secondMax);
    }
}

