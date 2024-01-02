public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("o1");
        EvenThread evenThread = new EvenThread("e1");
        oddThread.start();
        try {
            oddThread.getThread().join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        evenThread.start();
    }
}
