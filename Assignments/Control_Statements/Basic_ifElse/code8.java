class code8 {
    public static void main(String[] args) {
        int number = 25; // Hardcoded value

        if (number % 2 == 0 || number % 5 == 0 || number % 10 == 0) {
            System.out.println("The number " + number + " is divisible by either 2, 5, or 10.");
        } else {
            System.out.println("The number " + number + " is Not Divisible By 2, 5, 10.");
        }
    }
}

