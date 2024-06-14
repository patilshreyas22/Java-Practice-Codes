class code3 {
    public static void main(String[] args) {
        // Example Input 1
        char ch1 = 'a';

        // Convert character to lowercase for case insensitivity
        ch1 = Character.toLowerCase(ch1);

        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
            System.out.println(ch1 + " is vowel");
        } else {
            System.out.println(ch1 + " is consonant");
        }

        // Example Input 2
        char ch2 = 'D';

        // Convert character to lowercase for case insensitivity
        ch2 = Character.toLowerCase(ch2);

        if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
            System.out.println(ch2 + " is vowel");
        } else {
            System.out.println(ch2 + " is consonant");
        }
    }
}

