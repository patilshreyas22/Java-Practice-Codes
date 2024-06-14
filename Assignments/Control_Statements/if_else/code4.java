class code4 {
    public static void main(String[] args) {
        // Example Input 1
        double percentage1 = 87.5;

        if (percentage1 > 85.00) {
            System.out.println("Medical");
        } else if (percentage1 <= 85.00 && percentage1 > 75.00) {
            System.out.println("Engineering");
        } else if (percentage1 <= 75.00 && percentage1 >= 65.00) {
            System.out.println("Pharmacy or Bachelor in Science");
        } else {
            System.out.println("Other fields or undecided");
        }

        // Example Input 2
        double percentage2 = 78.3;

        if (percentage2 > 85.00) {
            System.out.println("Medical");
        } else if (percentage2 <= 85.00 && percentage2 > 75.00) {
            System.out.println("Engineering");
        } else if (percentage2 <= 75.00 && percentage2 >= 65.00) {
            System.out.println("Pharmacy or Bachelor in Science");
        } else {
            System.out.println("Other fields or undecided");
        }

        // Example Input 3
        double percentage3 = 70.5;

        if (percentage3 > 85.00) {
            System.out.println("Medical");
        } else if (percentage3 <= 85.00 && percentage3 > 75.00) {
            System.out.println("Engineering");
        } else if (percentage3 <= 75.00 && percentage3 >= 65.00) {
            System.out.println("Pharmacy or Bachelor in Science");
        } else {
            System.out.println("Other fields or undecided");
        }
    }
}

