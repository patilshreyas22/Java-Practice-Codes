class OrderDelayedException extends Exception {

    OrderDelayedException(String str) {
        super(str);
    }
}

class Zomato {

    boolean rainstatus = true;

    boolean raincheck() {
        return rainstatus;
    }

    void order(String food) throws OrderDelayedException {
        boolean val = raincheck();

        if (val) {
            throw new OrderDelayedException("Order Cancelled due to heavy rainfall");
        }

        System.out.println("Preparing food " + food);
    }
}

class User {

    public static void main(String[] args) {
        Zomato obj = new Zomato();

        try {
            obj.order("Biryani");
        } catch (OrderDelayedException ode) {
            System.out.println(ode.getMessage());
        }
    }
}

