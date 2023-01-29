public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("main group");
        System.out.println("Создаю потоки...");
        Thread thread1 = new MyThread(group, "Поток 1");
        thread1.setName("Поток 1");
        MyThread thread2 = new MyThread(group, "Поток 2");
        thread2.setName("Поток 2");
        MyThread thread3 = new MyThread(group, "Поток 3");
        thread3.setName("Поток 3");
        MyThread thread4 = new MyThread(group, "Поток 4");
        thread4.setName("Поток 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(15000);
        System.out.println("Завершаю все потоки.");
        group.interrupt();
    }
}
