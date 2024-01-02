public class EvenThread implements Runnable{
    private Thread thread;
    private final String name;

    public EvenThread(String name) {
        thread = new Thread(this, name);
        System.out.println("My thread created" + thread);
        this.name = name;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i%2 == 0) {
                    System.out.println(i);
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("Odd thread interrupted");
        }
    }
    public void start() {
        if (thread == null){
            thread = new Thread(this, name);
        }
        thread.start();
    }
}
