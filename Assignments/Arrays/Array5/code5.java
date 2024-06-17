import java.util.*;

class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] digitCounts = new int[size];

        for (int j = 0; j < arr.length; j++) {
            int num = arr[j];
            int count = 0;

            if (num == 0) {
                count = 1; // Special case for zero
            } else {
                // Count digits
                while (num != 0) {
                    num = num / 10;
                    count++;
                }
            }

            digitCounts[j] = count;
        }

        System.out.println("Number of digits in each element: ");
        for (int k = 0; k < digitCounts.length; k++) {
            System.out.println("Element " + arr[k] + " has " + digitCounts[k] + " digits.");
        }
    }
}

