class code9 {
    public static void main(String[] args) {
        int dayNumber = 3; // Hardcoded day number (1-7)

        switch (dayNumber) {
            case 1:
                System.out.println("Day " + dayNumber + " corresponds to: Sunday");
                break;
            case 2:
                System.out.println("Day " + dayNumber + " corresponds to: Monday");
                break;
            case 3:
                System.out.println("Day " + dayNumber + " corresponds to: Tuesday");
                break;
            case 4:
                System.out.println("Day " + dayNumber + " corresponds to: Wednesday");
                break;
            case 5:
                System.out.println("Day " + dayNumber + " corresponds to: Thursday");
                break;
            case 6:
                System.out.println("Day " + dayNumber + " corresponds to: Friday");
                break;
            case 7:
                System.out.println("Day " + dayNumber + " corresponds to: Saturday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}

