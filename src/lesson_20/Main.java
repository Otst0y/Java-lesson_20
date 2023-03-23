package lesson_20;

public class Main {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		RunnableThread runThread = new RunnableThread();
        Thread rt = new Thread(runThread);

        mt.start();
        rt.start();
	}
}
