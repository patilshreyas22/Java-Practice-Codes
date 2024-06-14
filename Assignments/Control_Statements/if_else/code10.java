import java.util.Scanner;

class code10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Ticket Booking System");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry, online ticket booking is not allowed for minors.");
            System.out.println("Please visit our ticket counter for assistance.");
        } else {
            System.out.print("Enter number of tickets to book: ");
            int numberOfTickets = scanner.nextInt();

            if (numberOfTickets <= 0) {
                System.out.println("Please enter a valid number of tickets.");
            } else {
                System.out.println("Tickets booked successfully for " + numberOfTickets + " person(s).");
                System.out.println("Thank you for using our Online Ticket Booking System.");
            }
        }

        scanner.close();
    }
}

