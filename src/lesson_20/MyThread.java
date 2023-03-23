package lesson_20;

import java.util.Scanner;

public class MyThread extends Thread {

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci numbers to display: ");
		int number = scan.nextInt();

		int f1 = 0;
		int f2 = 1;
		System.out.print("Thread: " + f1 + " " + f2 + " ");
		for (int i = 0; i < number; i++) {
			int f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class RunnableThread implements Runnable {

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci numbers to display: ");
		int number = scan.nextInt();

		int[] fib = new int[number];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < number; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		System.out.println("Runnable: ");
		for (int i = number - 1; i >= 0; i--) {
			System.out.print(fib[i] + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}