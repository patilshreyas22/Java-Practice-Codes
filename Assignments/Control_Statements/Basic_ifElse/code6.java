class code6 {
    public static void main(String[] args) {
        int number = 21; // Hardcoded value

        if (number % 3 == 0 || number % 7 == 0) {
            if (number % 3 == 0 && number % 7 == 0) {
                System.out.println("The number " + number + " is divisible by both 3 and 7.");
            } else if (number % 3 == 0) {
                System.out.println("The number " + number + " is divisible by 3.");
            } else {
                System.out.println("The number " + number + " is divisible by 7.");
            }
        } else {
            System.out.println("The number " + number + " is neither divisible by 3 nor by 7.");
        }
    }
}

