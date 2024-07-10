class MultiThreadingDemo extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("In Fun");
                Thread.sleep(2000);
	
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}

 class User {
    public static void main(String[] args) {
        MultiThreadingDemo obj = new MultiThreadingDemo();
        obj.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("In Main");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }
    }
}

