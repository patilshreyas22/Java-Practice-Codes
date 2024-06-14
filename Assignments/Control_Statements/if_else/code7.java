class code7 {
    public static void main(String[] args) {
        // Example Input 1
        int sellingPrice1 = 1200;
        int costPrice1 = 1000;

        if (sellingPrice1 > costPrice1) {
            int profit1 = sellingPrice1 - costPrice1;
            System.out.println("Profit of " + profit1);
        } else if (sellingPrice1 < costPrice1) {
            int loss1 = costPrice1 - sellingPrice1;
            System.out.println("Loss of " + loss1);
        } else {
            System.out.println("No profit no loss");
        }

        // Example Input 2
        int sellingPrice2 = 300;
        int costPrice2 = 500;

        if (sellingPrice2 > costPrice2) {
            int profit2 = sellingPrice2 - costPrice2;
            System.out.println("Profit of " + profit2);
        } else if (sellingPrice2 < costPrice2) {
            int loss2 = costPrice2 - sellingPrice2;
            System.out.println("Loss of " + loss2);
        } else {
            System.out.println("No profit no loss");
        }

        // Example Input 3
        int sellingPrice3 = 900;
        int costPrice3 = 900;

        if (sellingPrice3 > costPrice3) {
            int profit3 = sellingPrice3 - costPrice3;
            System.out.println("Profit of " + profit3);
        } else if (sellingPrice3 < costPrice3) {
            int loss3 = costPrice3 - sellingPrice3;
            System.out.println("Loss of " + loss3);
        } else {
            System.out.println("No profit no loss");
        }
    }
}

