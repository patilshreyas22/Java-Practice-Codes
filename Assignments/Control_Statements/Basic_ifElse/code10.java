class code10 {
    public static void main(String[] args) {
        int monthNumber = 8; // Hardcoded month number (1-12)

        switch (monthNumber) {
            case 1:
                System.out.println("Month " + monthNumber + " corresponds to: January");
                break;
            case 2:
                System.out.println("Month " + monthNumber + " corresponds to: February");
                break;
            case 3:
                System.out.println("Month " + monthNumber + " corresponds to: March");
                break;
            case 4:
                System.out.println("Month " + monthNumber + " corresponds to: April");
                break;
            case 5:
                System.out.println("Month " + monthNumber + " corresponds to: May");
                break;
            case 6:
                System.out.println("Month " + monthNumber + " corresponds to: June");
                break;
            case 7:
                System.out.println("Month " + monthNumber + " corresponds to: July");
                break;
            case 8:
                System.out.println("Month " + monthNumber + " corresponds to: August");
                break;
            case 9:
                System.out.println("Month " + monthNumber + " corresponds to: September");
                break;
            case 10:
                System.out.println("Month " + monthNumber + " corresponds to: October");
                break;
            case 11:
                System.out.println("Month " + monthNumber + " corresponds to: November");
                break;
            case 12:
                System.out.println("Month " + monthNumber + " corresponds to: December");
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}

