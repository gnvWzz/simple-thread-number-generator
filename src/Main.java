public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator("NG1"));
        Thread thread2 = new Thread(new NumberGenerator("NG2"));

        int maxPriority = Thread.MAX_PRIORITY;
        int minPriority = Thread.MIN_PRIORITY;
//        thread1.setPriority(maxPriority);
//        thread2.setPriority(minPriority);
        thread1.start();
        thread2.start();
    }
}