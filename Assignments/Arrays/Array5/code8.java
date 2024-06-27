import java.util.*;

class code8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Add elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (size < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + secondMin);
        }
    }
}

